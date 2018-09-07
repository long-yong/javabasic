package assign.calculator;

public class Calculator implements CalculatorInterface {

    private Double operand1;
    private Double operand2;
    private String op;
    private Double result;

    public Calculator() {  operand1=null;  operand2=null;  op=null;  result=null; }

    public void setOperandOne(double myOperand1) {  operand1 = myOperand1;  }
    public void setOperandTwo(double myOperand2) {  operand2 = myOperand2;  }
    public void setOperation (String myOp)       {  if(myOp.equals("+")||myOp.equals("-")) op=myOp; else op=null; }

    @Override
    public boolean performOperation() {
        if(operand1==null||operand2==null||op==null) return false;
        if(op.equals("+")) result = operand1 + operand2;
        if(op.equals("-")) result = operand1 - operand2;
        return true;
    }

    @Override
    public Double getResults() {
        return result;
    }

}
