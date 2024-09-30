//package demo.websquare.app.service;
//
//
//import demo.websquare.app.constant.ResponseCode;
//import demo.websquare.app.dto.response.ApiError;
//import demo.websquare.app.dto.response.Meta;
//import demo.websquare.app.dto.response.ResponseDto;
//import lombok.RequiredArgsConstructor;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Service;
//
//import java.util.Collection;
//
//@Service
//@RequiredArgsConstructor
//public class ResponseFactory {
//
//    @Value("${spring.application.name}")
//    String appName;
//
//    public ResponseDto response(ResponseCode responseCode) {
//        var meta = Meta.builder()
//                .status(responseCode.getCode())
//                .message(responseCode.getMessage())
//                .serviceId(appName)
//                .build();
//
//        return new ResponseDto(meta, null);
//    }
//
//    public ResponseDto response(Object data) {
//        var meta = Meta.builder()
//                .status(ResponseCode.SUCCESS.getCode())
//                .serviceId(appName)
//                .build();
//
//        return new ResponseDto(meta, data);
//    }
//
//    public ResponseDto invalidParams(Collection<ApiError> errors) {
//        var meta = Meta.builder()
//                .status(ResponseCode.INVALID_FIELD.getCode())
//                .serviceId(appName)
//                .errors(errors)
//                .build();
//
//        return new ResponseDto(meta, null);
//    }
//}