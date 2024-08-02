package demo.websquare.domain.employee.dto.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Builder
public class SearchResponse {
    private List<EmployeeDTO> employees;
    private Pagination paginations;
}
