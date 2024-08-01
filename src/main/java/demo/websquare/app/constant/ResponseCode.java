package demo.websquare.app.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ResponseCode {

    SUCCESS("SUCCESS", 200),
    INTERNAL_SERVER_ERROR("INTERNAL_SERVER_ERROR", 500),
    UNAUTHORIZED("UNAUTHORIZED", 401),
    INVALID_ACCESS_TOKEN("INVALID_ACCESS_TOKEN", 401),
    INVALID_REFRESH_TOKEN("INVALID_REFRESH_TOKEN", 401),
    INVALID_ID_TOKEN("INVALID_ID_TOKEN", 401),
    FORBIDDEN("FORBIDDEN", 403),
    INVALID_REQUEST("INVALID_REQUEST", 400),
    BAD_REQUEST("BAD_REQUEST", 400),
    INVALID_FIELD("INVALID_FIELD", 400),
    EMPLOYEE_NOT_FOUND("Employee not found", 404),
    CREATE_EMPLOYEE_ERROR("Failed to create employee", 500),
    UPDATE_EMPLOYEE_ERROR("Failed to update employee", 500),
    DELETE_EMPLOYEE_ERROR("Failed to delete employee", 500),
    CREATE_OR_UPDATE_EMPLOYEE_ERROR("Failed to save employee", 500),
    ;

    private final String message;
    private final Integer code;

}