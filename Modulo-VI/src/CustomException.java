import java.util.Date;

public class CustomException extends Exception {
    public CustomException() {
        super();
    }

    public void imprimirData() {
        System.out.println(super.getMessage() + new Date());
    }
}
