//Enter cost of 3 items from the user (using float data type) - a pencil, a pen and 
//an eraser. You have to output the total cost of the items back to the user as their bill.

import java.util.Scanner;
public class bill {
    public static float billing(float x,float y, float z){
        return x + y + z;
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter pencil price : ");
        float pencilCost = scn.nextFloat();
        System.out.println("Enter pen price : ");
        float penCost = scn.nextFloat();
        System.out.println("Enter eraser price : ");
        float erazerCost = scn.nextFloat();
        float Total = billing(pencilCost,penCost,erazerCost);
        System.out.println("Total amount is :"+Total);
   
        float newTotal = Total + (0.18f * Total);
        System.out.println("Payable Amount is :"+newTotal);
    }
}