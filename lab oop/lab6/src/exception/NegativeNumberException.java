package exception;

public class NegativeNumberException extends RuntimeException {

    private int number;

    public NegativeNumberException(int number) {
        super("Number is negative: " + number);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}
