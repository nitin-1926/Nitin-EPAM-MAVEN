package org.example;
import java.util.*;

public class App
{
    public static void main( String[] args )
    {
        System.out.println("Enter");
        System.out.println("1 for Addition\n2 for Subtraction\n3 for Multiplication\n4 for Division");
        System.out.println("Enter choice (1/2/3/4): ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        double num1,num2;
        switch(choice)
        {
            case 1 :
                System.out.println("Enter 1st number : ");
                num1=sc.nextDouble();
                System.out.println("Enter 2nd number : ");
                num2=sc.nextDouble();
                Addition add = new Addition(num1, num2);
                System.out.println(add.calculate());
                break;

            case 2 :
                System.out.println("Enter 1st number : ");
                num1=sc.nextDouble();
                System.out.println("Enter 2nd number : ");
                num2=sc.nextDouble();
                Subtraction sub = new Subtraction(num1, num2);
                System.out.println(sub.calculate());
                break;

            case 3 :
                System.out.println("Enter 1st number : ");
                num1=sc.nextDouble();
                System.out.println("Enter 2nd number : ");
                num2=sc.nextDouble();
                Multiplication mul = new Multiplication(num1, num2);
                System.out.println(mul.calculate());
                break;

            case 4 :
                System.out.println("Enter 1st number : ");
                num1=sc.nextDouble();
                System.out.println("Enter 2nd number : ");
                num2=sc.nextDouble();
                Division div = new Division(num1, num2);
                System.out.println(div.calculate());
                break;

            default :
                System.out.println("Invalid choice");
        }
    }
}