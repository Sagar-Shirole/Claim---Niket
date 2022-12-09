package healspan.com.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class ExceptionDetail {

    private String message;
    private HttpStatus responseStatus;
    private LocalDateTime dateTime;
}
