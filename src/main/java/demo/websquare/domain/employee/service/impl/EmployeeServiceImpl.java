package demo.websquare.domain.employee.service.impl;

import demo.websquare.app.constant.ResponseCode;
import demo.websquare.app.dto.exception.BusinessException;
import demo.websquare.domain.employee.converter.EmployeeConverter;
import demo.websquare.domain.employee.dto.response.Pagination;
import demo.websquare.domain.employee.dto.request.EmployeeRequest;
import demo.websquare.domain.employee.dto.request.ParamSearchRequest;
import demo.websquare.domain.employee.entity.Employee;
import demo.websquare.domain.employee.repository.EmployeeRepository;
import demo.websquare.domain.employee.service.IEmployeeService;
import demo.websquare.infrastructure.util.DataUtils;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements IEmployeeService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeConverter employeeConverter;
    private static final Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);

    @Transactional
    public void delete(List<String> ids) {
        if (ids == null || ids.isEmpty()) {
            throw new BusinessException(ResponseCode.IDS_NOT_FOUND);
        }

        List<Employee> employees = employeeRepository.findAllById(ids);
        try {
            employeeRepository.deleteAll(employees);
        } catch (Exception e) {
            throw new BusinessException(ResponseCode.DELETE_EMPLOYEE_ERROR);
        }
    }

    @Transactional
    public Employee createOrUpdate(EmployeeRequest employeeRequest) {
        Employee employee = new Employee();

        try {
            if (employeeRequest.getId() != null) {
                employee = employeeRepository.findById(employeeRequest.getId()).get();
            } else {
                employee.setCreatedDate(new Date());
            }

            BeanUtils.copyProperties(employeeRequest, employee);
            employee.setBirthDate(employeeRequest.getBirthDate() == null ? employee.getBirthDate() : DataUtils.convertStringToDate(employeeRequest.getBirthDate()));
            employeeRepository.save(employee);

            return employee;
        } catch (Exception e) {
            throw new BusinessException(ResponseCode.CREATE_OR_UPDATE_EMPLOYEE_ERROR);
        }
    }

    public Pagination searchEmployees(ParamSearchRequest searchRequest) {
        Pageable sortedPageable = Pageable.ofSize(searchRequest.getPageSize()).withPage(searchRequest.getPage());

        Page<Employee> page = employeeRepository.searchCondition(
                searchRequest.getName(),
                searchRequest.getTeam(),
                searchRequest.getPhone(),
                searchRequest.getGender(),
                DataUtils.stringToDate(searchRequest.getDateFrom()),
                DataUtils.stringToDate(searchRequest.getDateTo()),
                sortedPageable
        );

        return Pagination.builder()
                .data(employeeConverter.convertToDTO(page.getContent()))
                .totalElement(page.getTotalElements())
                .totalPage(page.getTotalPages())
                .pageIndex(page.getNumber())
                .pageSize(page.getSize())
                .build();
    }


    public List<Employee> exportDataToExcel(ParamSearchRequest searchRequest) {
        List<Employee> listEmployee = employeeRepository.downloadsExcel(
                searchRequest.getName(),
                searchRequest.getTeam(),
                searchRequest.getPhone(),
                searchRequest.getGender(),
                DataUtils.stringToDate(searchRequest.getDateFrom()),
                DataUtils.stringToDate(searchRequest.getDateTo())
        );

        return listEmployee;
    }
}
