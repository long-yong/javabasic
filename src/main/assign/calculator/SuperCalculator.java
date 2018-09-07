package assign.calculator;

import java.util.ArrayList;

public class SuperCalculator {

    private ArrayList<String> list = new ArrayList<>();
    private Double result = null;

    public void performOperation(Integer i)  {  performOperation(i.toString()); }
    public void performOperation(Double d)   {  performOperation(d.toString()); }
    public void performOperation(String str) {  if(str=="=") checkSum();  else { list.add(str);  checkMultiple(); } }

    public Double getResults() {
        return result;
    }

    private void checkMultiple()
    {
        int len = list.size();
        if(len<3) return;
        String str = list.get(len-2);
        if(str=="*")
        {
            Double I1 = Double.parseDouble(list.get(len-3));
            Double I2 = Double.parseDouble(list.get(len-1));
            I1 = I1 * I2;
            list.set(len-3,I1.toString());
            list.remove(len-1);
            list.remove(len-2);
        }
        if(str=="/") {
            Double I1 = Double.parseDouble(list.get(len-3));
            Double I2 = Double.parseDouble(list.get(len-1));
            I1 = I1 / I2;
            list.set(len-3,I1.toString());
            list.remove(len-1);
            list.remove(len-2);
        }
    }

    private void checkSum() {
        result = null;
        if(list.size()==1) {
            result = Double.parseDouble(list.get(0));
        }
        while(list.size()>=3) {
            Double d1 = Double.parseDouble(list.get(0));
            Double d2 = Double.parseDouble(list.get(2));
            String str = list.get(1);
            if(str=="+") { result = d1 + d2; }
            else         { result = d1 - d2; }
            list.set(0,result.toString());
            list.remove(1);
            list.remove(1);
        }
        if(list.size()!=1) result=null;
        list.clear();
    }

    public void displayList() {
        System.out.println(" ");
        for(String s:list) System.out.println(s+" ");
    }

    public void displayResult() {
        System.out.println("\nResult: "+result);
    }

}
