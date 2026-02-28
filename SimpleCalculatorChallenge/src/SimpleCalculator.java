

public class SimpleCalculator {

    // Fields
    private double firstNumber;
    private double secondNumber;

    // Getter Methods
    public double getFirstNumber() {

        return this.firstNumber;
    }

    public double getSecondNumber() {

        return this.secondNumber;
    }

    // Setter Methods
    public void setFirstNumber(double firstNumber) {

        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {

        this.secondNumber = secondNumber;
    }

    // Addition Method
    public double getAdditionResult() {

        return this.firstNumber + this.secondNumber;
    }

    // Subtraction Method
    public double getSubtractionResult() {

        return this.firstNumber - this.secondNumber;
    }

    // Multiplication Method
    public double getMultiplicationResult() {

        return this.firstNumber * this.secondNumber;
    }

    // Division Method
    public double getDivisionResult() {

        if (this.secondNumber == 0) {
            return 0;
        }

        return (this.firstNumber / this.secondNumber);
    }

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();

        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add = " + calculator.getAdditionResult());
        System.out.println("subtract = " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply = " + calculator.getMultiplicationResult());
        System.out.println("divide = " + calculator.getDivisionResult());

    }
}