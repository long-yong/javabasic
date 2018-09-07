package assign.calculator;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calc = new Calculator(); System.out.println("Create a calculator\n");

        calc.setOperandOne(10); System.out.println("Set operand1: 10");
        calc.setOperandTwo(20); System.out.println("Set operand2: 20");
        calc.performOperation(); System.out.println("Get result: " +calc.getResults());
        calc.setOperation("+");  System.out.println("Set operation: +");
        calc.performOperation(); System.out.println("Get result: " +calc.getResults());

        System.out.println(" ");
        calc.setOperandOne(20); System.out.println("Set operand1: 20");
        calc.setOperandTwo(10); System.out.println("Set operand2: 10");
        calc.setOperation("-"); System.out.println("Set operation: -");
        calc.performOperation(); System.out.println("Get result: " +calc.getResults());
    }
}
