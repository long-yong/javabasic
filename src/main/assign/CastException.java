package assign;

import java.util.ArrayList;

public class CastException {
    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");

        try{
            for(Object obj: myList) {
                Integer I = (Integer) obj;
            }
        }

        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
