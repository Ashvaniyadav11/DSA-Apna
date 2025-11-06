import java.util.Scanner;
public class range{
    public static void rangeg(int x , int y){
        for(int i = x; i <= y; i++){
            if(i%2==0){
                System.out.print(i+ " ");
            }
            
        }
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
         rangeg(m,n);
    }
}