package assign;
import java.util.*;

public class PuzzleJava {

    public static void main(String[] args) {
        PuzzleJava puzzle = new PuzzleJava();

        puzzle.arrGreaterThan10();   System.out.println(" ");
        puzzle.randStringArray();    System.out.println(" ");
        puzzle.rand55To100();        System.out.println(" ");
        puzzle.randSortedArray();    System.out.println(" ");
        System.out.println("randString is: " + puzzle.randString());
        puzzle.randStringArr();      System.out.println(" ");
    }

    public void printArr(int[]    arr) {
        for(int    x:arr) System.out.print(x + " ");
    }
    public void printArr(String[] arr) {
        for(String x:arr) System.out.print(x + " ");
    }

    public int[] arrGreaterThan10() {
        int[] arr = { 3,5,1,2,7,9,8,13,25,32 };
        int count = 0;
        int[] arr1 = new int[arr.length];
        for(int x:arr) if(x>10) { arr1[count]=x; count++; }
        int[] arr2 = new int[count]; System.arraycopy(arr1,0,arr2,0,count);
        printArr(arr); System.out.print(" Array greater than 10 is: "); printArr(arr2);
        return arr2;
    }

    public String[] randStringArray() {
        String[] arr = { "Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa" };  printArr(arr);
        List<String>list = new ArrayList<>(Arrays.asList(arr));
        Collections.shuffle(list);
        arr = new String[list.size()];
        list.toArray(arr);
        System.out.print(" The shuffled array is: ");
        printArr(arr);
        return arr;
    }

    public int rand55To100() {
        Random rand = new Random();
        int ans = 55+rand.nextInt(101-55);
        System.out.print("Random integer of 55 to 100 is: " + ans);
        return ans;
    }

    public int[] randSortedArray() {
        int[] arr = new int[10];
        Random rand = new Random();
        for(int i=0;i<10;i++) {
            arr[i]= 55+rand.nextInt(101-55);
        }
        Arrays.sort(arr);
        System.out.print("randSortedArray is: ");  printArr(arr);
        return arr;
    }

    public String randString() {
        Random rand = new Random();
        String str = "";
        for(int i=0;i<5;i++) {
            char c= (char) rand.nextInt(62);
            if(c<10)      { c+='0'; str += c; }
            else if(c<36) { c-=10; c+='a'; str += c; }
            else          { c-=36; c+='A'; str += c; }
        }
        return str;
    }

    public String[] randStringArr() {
        String [] arr = new String[10];
        for(int i=0; i<10; i++) {  arr[i]=randString(); }
        System.out.print("randStringArr is:"); printArr(arr);
        return arr;
    }
}

