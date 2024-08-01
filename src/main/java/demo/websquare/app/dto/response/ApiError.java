package demo.websquare.app.dto.response;

public interface ApiError {

    String message();

    static ApiError createFieldApiError(String field, String message) {
        return new ApiErrorField(field, message);
    }

    record ApiErrorField(String field, String message) implements ApiError {
    }
}