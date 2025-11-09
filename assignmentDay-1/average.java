import java.util.Scanner;
public class average{
    public static float threeaverage(int x , int y , int z){
        float ave = (x + y + z) / 3;
        return ave;
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter A");
        int A = scn.nextInt();
        System.out.println("Enter B");
        int B = scn.nextInt();
        System.out.println("Enter C");
        int C = scn.nextInt();

        float comaverage = threeaverage(A,B,C);
        System.out.println("Average of Three numbers : "+comaverage);
        
    }
}