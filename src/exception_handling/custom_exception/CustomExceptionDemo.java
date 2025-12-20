package exception_handling.custom_exception;

public class CustomExceptionDemo {

    static void validate(int marks) throws CustomException {
        if (marks < 40) {
            throw new CustomException("Failed");
        }
        System.out.println("Passed");
    }

    public static void main(String[] args) {
        try {
            validate(35);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}
