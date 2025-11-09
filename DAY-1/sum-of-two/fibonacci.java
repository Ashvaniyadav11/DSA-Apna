import java.util.Scanner;
public class fibonacci {
    public static void fibbo(int n){
        int first = 0;
        int second = 1;
        int third = 0;
        for(int i =0; i<n; i++){
             System.out.print(" "+first);
             //logic for next term calulation
             third = first + second;
           
            first = second;
            second = third;
        }
    }
    public static void main(String args[]){
      Scanner scn = new Scanner(System.in);
      int x = scn.nextInt();
      fibbo(x);
    }
}