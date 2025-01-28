import java.util.Scanner;
public class randomsum {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();
        int sum = num1+num2;
        System.out.println(" The sum of " + num1 + " and " + num2 + " is: " +sum);      
    }    
}


OUTPUT:
Enter the first number:
45
Enter the second number:
56
 The sum of 45 and 56 is: 101


  DESCRIPTION:
This is the simple program to add two random numbers it displays the sum of two numbers which has been randomly entered by the users by using "Scanner scanner = new Scanner(System.in)".
It gets the input from the user and then it adds the two numbers and displays the output by using "System.out.println()" function.
