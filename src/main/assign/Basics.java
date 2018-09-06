package assign;

import java.util.ArrayList;

public class Basics {

    public static void main(String[] args) {

        Basics basics = new Basics();

        basics.printVal();      System.out.println(" ");
        basics.printOdd();      System.out.println(" ");
        basics.printSum();      System.out.println(" ");
        basics.iterateArray();  System.out.println(" ");
        basics.findMax();       System.out.println(" ");
        basics.getAverage();    System.out.println(" ");
        basics.createOddArray();System.out.println(" ");
        basics.greaterThanY();  System.out.println(" ");
        basics.squareArray();   System.out.println(" ");
        basics.positiveArray(); System.out.println(" ");
        basics.maxMinAve();     System.out.println(" ");
        basics.arrayShiftOne(); System.out.println(" ");

    }

    public void printArr(int[] arr) {
        for(int x:arr) System.out.print(x + " ");
    }

    public void printArr(float[] arr) {
        for(float x:arr) System.out.print(x + " ");
    }

   public void printVal() {
        for (int i = 1; i <= 255; i++) {
            System.out.print(i + " ");
            if(i%10==9)  System.out.print("\n");
        }
    }

   public void printOdd() {
        for (int i = 1; i <= 255; i++) {
            if(i%2==0) continue;
            System.out.print(i + " ");
            if(i%10==9)  System.out.print("\n");
        }
   }

   public void printSum() {
        int sum=0;
        for(int i=0;i<=255;i++){
            sum+=i;
            System.out.println("New number: "+ i + "  Sum: " + sum);
        }
   }

   public void iterateArray() {
        int[] arr = {1, 3, 5, 7, 9, 13};
        for(int x:arr) {
            System.out.print(x+ " ");
        }
   }

   public void findMax() {
        int[] arr = {1, 3, 5, -7, 9, -13};
        int max = arr[0];
        for(int x:arr) {  if(x>max) max=x;  }
        printArr(arr); System.out.print(" max = " + max);
   }

   public void getAverage() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int sum = 0;
        for(int x:arr) {  sum += x;  }
        printArr(arr); System.out.print(" average = " + 1.0*sum/arr.length);
   }

   public int[] createOddArray() {
        int[] arr = new int[256];
        int count = 0;
        for(int i=0;i<=255;i++) if(i%2==1) {  arr[count]=i; count++;  }
        int[] arr1 = new int[count];
        System.arraycopy(arr,0, arr1, 0, count);
        printArr(arr1);
        return arr1;
   }

    public void greaterThanY() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int Y = 3;
        int count = 0;
        for(int x:arr) { if(x>Y) count++; }
        printArr(arr);  System.out.print(" numbers greater than " + Y + " are " + count);
    }

    public void squareArray() {
        int[] arr = {1, -2, 3, -4, 5, -6};
        printArr(arr);
        for(int i=0;i<arr.length;i++) {  arr[i]=arr[i]*arr[i]; }
        System.out.print(" Squared array: ");
        printArr(arr);
    }

    public void positiveArray() {
        int[] arr = {1, -2, 3, -4, 5, -6};
        printArr(arr);
        for(int i=0;i<arr.length;i++) {  if(arr[i]<0) arr[i]=0; }
        System.out.print(" positive array: ");
        printArr(arr);
    }

    public void maxMinAve() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        float[] newarr = new float[3];
        int max=arr[0], min=arr[0], sum=0;
        for(int x:arr) { if(max<x) max=x; if(min>x) min=x; sum+=x; }
        newarr[0]=max; newarr[1]=min; newarr[2] = sum; newarr[2]/=arr.length;
        printArr(arr);  System.out.print(" Max/Min/Ave = "); printArr(newarr);
    }

    public void arrayShiftOne() {
        int[] arr = {1, 2, 3, 4, 5, 6}; printArr(arr);
        for(int i=0;i<arr.length-1;i++) arr[i]=arr[i+1];
        arr[arr.length-1] = 0;
        System.out.print(" one shifted array is: "); printArr(arr);
    }

}
