import java.util.Scanner;
public class sum {  
    public static int summ(int x, int y) {
        return x + y;
    }
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = summ(a, b);
        System.out.println(c);
    } 
}
