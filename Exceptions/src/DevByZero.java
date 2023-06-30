import java.io.FileInputStream;
import java.io.IOException;

public class DevByZero {
   private int value = ((int) (Math.random() * 2));

    protected void throwException() {
        try {
            int result = 1 / value;
            System.out.println(result);
        } catch (Exception e) {
           //System.out.println(e.getMessage());
           e.printStackTrace();
        }
    }
    protected void retrowException() {

        try {
            int result = 1 / value;
            System.out.println(result);
        } catch (Exception e) {
            throw new RuntimeException("Oops, you're trying to divide by zero", e);
        }
    }

    protected void solveException() {

        try {
            int result = 1 / value;
            System.out.println(result);
        } catch (Exception e) {
            value++;
            int result = 1 / value;
            System.out.println(result + " (changed)");
        }

    }


}





