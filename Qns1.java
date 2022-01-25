import java.util.Scanner;

public class Qns1
{
    public static final double PI = 3.14159;
    public static void main(String[] args) 
    {
        double area = 0.0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for radius:");
        double radius = input.nextDouble();

        area = PI * radius * radius;

        System.out.println("The area of a circle of radius " + radius + " is " +area);
        input.close();
    }
}