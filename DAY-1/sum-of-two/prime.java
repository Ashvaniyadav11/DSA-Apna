import java.util.Scanner;
public class prime{
    public static void isprime(int n){
        if(n%2==0 || n%1==1){
            System.out.println(n+ " is not prime ");
        }
        else{
            System.out.println(n+" is  prime");
        }
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int nu = scn.nextInt();
        isprime(nu);
    }
}