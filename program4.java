class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public program4 A {
    static void divide(int a, int b) throws MyException {
        if (b == 0) {
            throw new MyException("Cannot Divide by Zero");
        } else {
            System.out.println("Result: " + (a / b));
        }
    }

    public static void main(String[] args) {
        try {
            divide(10, 0);
        } catch (MyException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("This is the finally block. It always executes");
        }
    }
}
	