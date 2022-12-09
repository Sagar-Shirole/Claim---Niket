package healspan.com.exception;

public class NoClaimFoundException extends RuntimeException{
    public NoClaimFoundException(String msg){
        super(msg);
    }
}
