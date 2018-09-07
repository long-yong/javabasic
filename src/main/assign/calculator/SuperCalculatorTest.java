package assign.calculator;

public class SuperCalculatorTest {

    public static void main(String[] args) {

        SuperCalculator calc = new SuperCalculator();

        calc.performOperation("10.5");

        calc.performOperation("+");

        calc.performOperation(5.2);

        calc.performOperation("*");

        calc.performOperation(10);

        calc.displayList();

        calc.performOperation("=");

        calc.displayResult();

        // 62.5
    }
}
