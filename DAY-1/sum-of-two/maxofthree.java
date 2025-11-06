import java.util.Scanner;
public class maxofthree{
    public static void Max_of_three(int x, int y, int z){
        if(x>y && x>z){
            System.out.println(x+" is Greater");
        }
        else if(y>x && y>z){
           System.out.println(y+" is Greater"); 
        }
        else{
            System.out.println(z+" is Greater");
        }
    }
    public static void main(String args[]){
    Scanner scn = new Scanner(System.in);
    int a = scn.nextInt();
    int b = scn.nextInt();
    int c = scn.nextInt();
    Max_of_three(a,b,c);
    
    }
}