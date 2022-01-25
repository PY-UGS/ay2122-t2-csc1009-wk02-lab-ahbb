import java.util.Scanner;

public class Qns2 
{
    public static void main(String[] args)
    {
        double average,sum = 0.0;

        //declaring double array to store user input
        double userInput[] = new double[10];
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        
        for (int i=0;i<3;i++)
        {
            userInput[i] = input.nextDouble(); //reading userInput three times
            sum += userInput[i]; //getting summation of 3 userInput
        }

        //getting average
        average = sum/3;

        System.out.print("The average of ");
        
        //printing user input
        for (int i=0;i<3;i++)
        {
            System.out.print(userInput[i]+" ");
        }

        System.out.print("is "+ average);
        input.close();
    }
}
