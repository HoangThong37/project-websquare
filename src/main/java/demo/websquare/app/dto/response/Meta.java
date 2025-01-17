package demo.websquare.app.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Meta {
    private Integer status;
    private String message;

    @JsonProperty("service_id")
    private String serviceId;

    private Collection<ApiError> errors;
}