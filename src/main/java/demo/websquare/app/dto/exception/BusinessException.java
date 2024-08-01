package demo.websquare.app.dto.exception;

import demo.websquare.app.constant.ResponseCode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor

public class BusinessException extends RuntimeException {

    private ResponseCode responseCode;

    public BusinessException(ResponseCode responseCode) {
        //super(responseCode.getMessage()); // Set the exception message
        this.responseCode = responseCode;
    }

//    public ResponseCode getResponseCode() {
//        return responseCode;
//    }
}