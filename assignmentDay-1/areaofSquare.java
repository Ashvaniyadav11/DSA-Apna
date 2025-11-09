import java.util.Scanner;
public class areaofSquare{
    public static float square(float r){
        return r*r;
    }
    public static void main(String args[]){
    Scanner scn = new Scanner(System.in);
    System.out.print("Enter side of square: ");
    float side = scn.nextFloat();
    System.out.println("Area of Square is : "+square(side));
    }
}