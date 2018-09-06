package cls.practice;

public class TryCatch {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int sum=0;
        try {
            for (int i=0; i<15; i++) sum+=arr[i];
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown  :" + e);
        }
        System.out.println(sum);
    }
}
