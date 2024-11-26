import java.util.Scanner;
public class IT24104110Lab5Q1 {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);

        System.out.print("Enter 1st number: ");
        int num1 =input.nextInt();

        System.out.print("Enter 2nd number: ");
        int num2 = input.nextInt();

        System.out.print("Enter 3rd number: ");
        int num3 = input.nextInt();

	System.out.println("User entered numbers are: " + num1 + " " + num2 + " " + num3);

        if ((num1>num2) && (num1>num3))
        {
            System.out.println("The largest number is : "+ num1);
        }
        else if ((num2>num1)&&(num2>num3))
        {
            System.out.println("The largest number is : " + num2);
        }
        else if ( (num3>num1)&&(num3>num2))
        {
            System.out.println("The largest number is : " + num3);
        }
        if ((num1<num2)&&(num1<num3)){
            System.out.println("Smallest number is : "+ num1);
        }
        else if( (num2<num3)&&(num2<num1))
        {
            System.out.println("Smallest number is : "+ num2);
        }
        else if ( (num3<num1)&&(num3<num2))
        {
            System.out.println("Smallest number is :"+ num3);
        }
    }
}