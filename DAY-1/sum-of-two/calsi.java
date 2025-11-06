import java.util.Scanner;
public class calsi{
    public static float simpleinterest(float P ,float R , float T){
         float si = P * R * T/100;
        return si;
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        float price = scn.nextFloat();
        float rate = scn.nextFloat();
        float time = scn.nextFloat();

        float s_i = simpleinterest(price,rate,time);
        System.out.println(s_i);

        
    }
}