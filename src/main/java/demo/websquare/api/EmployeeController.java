package demo.websquare.api;

import demo.websquare.app.dto.response.ResponseDto;
import demo.websquare.app.service.ResponseFactory;
import demo.websquare.domain.employee.dto.response.Pagination;
import demo.websquare.domain.employee.dto.request.EmployeeRequest;
import demo.websquare.domain.employee.dto.request.SearchRequest;
import demo.websquare.domain.employee.service.IEmployeeService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/employees")
@Slf4j
public class EmployeeController {

    private final IEmployeeService employeeService;
    private final ResponseFactory responseFactory;

    @PostMapping("/search")
    public ResponseDto searchEmployee(@RequestBody SearchRequest searchRequest) {
        Pagination response = employeeService.searchEmployees(searchRequest.getParams());
        return responseFactory.response(response);
    }

    @PostMapping()
    public ResponseDto addOrUpdate(@Valid @RequestBody EmployeeRequest employee) throws ParseException {
        return responseFactory.response(employeeService.createOrUpdate(employee));
    }

    @DeleteMapping()
    public void delete(@RequestBody List<String> ids) {
        employeeService.delete(ids);
    }

    @PostMapping("/export")
    public ResponseDto exportEmployees(@RequestBody SearchRequest searchRequest) {
        return responseFactory.response(employeeService.exportDataToExcel(searchRequest.getParams()));
    }

}
