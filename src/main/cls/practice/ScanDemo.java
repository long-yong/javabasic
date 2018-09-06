package cls.practice;
import java.util.Scanner;

public class ScanDemo{

    public static void main(String[] args) {
        scan_a_word();
        scan_a_line();
        scan_a_int();
        scan_a_float();
    }

    public static void scan_a_word() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please input a word: ");
        if(scan.hasNext()){  String str = scan.next();  System.out.println("Your input is: "+str+"\n"); }
    }

    public static void scan_a_line() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please input a line: ");
        if(scan.hasNextLine()){  String str = scan.nextLine();  System.out.println("Your input is: "+str+"\n"); }
    }

    public static void scan_a_int() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please input a integer: ");
        if(scan.hasNextInt()){ int i = scan.nextInt(); System.out.println("Your input is: " + i + "\n" ); }
        else {  System.out.println("Invalid data!\n") ;  }
    }

    public static void scan_a_float() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please input a float: ");
        if(scan.hasNextFloat()){  float f = scan.nextFloat(); System.out.println("Your input is: " + f + "\n" );  }
        else {  System.out.println("Invalid data!\n"); }
    }

}
