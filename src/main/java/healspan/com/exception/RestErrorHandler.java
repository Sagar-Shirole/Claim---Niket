package healspan.com.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class RestErrorHandler{

    @ExceptionHandler
    public ResponseEntity<ExceptionDetail> handleException(Exception exception){
        ExceptionDetail exceptionDetail = new ExceptionDetail();
        exceptionDetail.setMessage(exception.getMessage());
        exceptionDetail.setResponseStatus(HttpStatus.BAD_REQUEST);
        exceptionDetail.setDateTime(LocalDateTime.now());
        return new ResponseEntity<>(exceptionDetail,HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler
    public ResponseEntity<ExceptionDetail> handleException(EmptyListException exception){
        ExceptionDetail exceptionDetail = new ExceptionDetail();
        exceptionDetail.setMessage(exception.getMessage());
        exceptionDetail.setResponseStatus(HttpStatus.BAD_REQUEST);
        exceptionDetail.setDateTime(LocalDateTime.now());
        return new ResponseEntity<>(exceptionDetail,HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler
    public ResponseEntity<ExceptionDetail> handleException(NoClaimFoundException exception){
        ExceptionDetail exceptionDetail = new ExceptionDetail();
        exceptionDetail.setMessage(exception.getMessage());
        exceptionDetail.setResponseStatus(HttpStatus.BAD_REQUEST);
        exceptionDetail.setDateTime(LocalDateTime.now());
        return new ResponseEntity<>(exceptionDetail,HttpStatus.BAD_REQUEST);
    }

}
