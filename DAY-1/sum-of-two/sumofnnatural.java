import java.util.Scanner;
public class sumofnnatural{
    public static int sumn(int n){
        int sum = 0;
    for(int i = 1; i<=n; i++){
          sum += i;
        }
        return sum;
    }
     
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int s = scn.nextInt();
        int si = sumn(s);
        System.out.println(si);
    }
}