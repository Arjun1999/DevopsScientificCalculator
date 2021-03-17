package calculator;
import java.util.*;

public class App
{
    public static void main(String args[])
    {
        int flag=0;
        int ch=0;
        double num,num1,num2;
        Scanner reader = new Scanner(System.in);
        System.out.println("Scientific Calculator");
        do
        {
            System.out.println("Function Menu");
            System.out.println("");
            System.out.println("1) Square Root");
            System.out.println("2) Factorial");
            System.out.println("3) Natural Logarithm");
            System.out.println("4) Power Function");
            System.out.println("5) Exit");
            System.out.print("Enter your choice: ");
            
            try 
            {
                ch = Integer.parseInt(reader.nextLine());
            } 
            catch (NumberFormatException e) 
            {
                e.printStackTrace();
            }

            if(ch==5)
            {
                flag = 1;
            }
            
            else
            {
                switch(ch)
                {
                case 1:
                System.out.println("Square Root");
                System.out.print("Enter a number : ");
                num = Double.parseDouble(reader.nextLine());
                System.out.println("The square root of " + num + " is " + sqroot(num) + "\n");
                break;
                
                case 2:
                System.out.println("Factorial");
                System.out.print("Enter a number : ");
                num = Double.parseDouble(reader.nextLine());
                System.out.println("The factorial of " + num + " is " + fact(num) + "\n");
                break;
                
                case 3:
                System.out.println("Natural Logarithm");
                System.out.print("Enter a number : ");
                num = Double.parseDouble(reader.nextLine());
                System.out.println("The natural logarithm of " + num + " is " + natlog(num) + "\n");
                break;
                
                case 4:
                System.out.println("Power Function");
                System.out.println("Enter two numbers");
                System.out.print("Enter base: ");
                num1 = Double.parseDouble(reader.nextLine());
                System.out.print("Enter exponent: ");
                num2 = Double.parseDouble(reader.nextLine());
                System.out.println("The value of " + num1 + " raised to " + num2 + " is " + powerf(num1, num2) + "\n");
                break;
                default: System.out.println("Exiting program due to invalid input"); flag = 1;
                }
            }
            System.out.println("\n");
        }while(flag==0);
    }

    public static double sqroot(double x)
    {
        if (x < 0) 
        {
            throw new IllegalArgumentException("Number cannot be negative.");
        }

        else
        {
            return Math.sqrt(x);
        }
    }

    public static double fact(double x)
    {
        double value = 1;
        double n = x;
        
        if (x < 0) 
        {
            throw new IllegalArgumentException("Number cannot be negative.");
        }

        else
        {
            while(n > 0)
            {
                value = value * n;
                n = n - 1;
            }
            
            return value;
        }
    }

    public static double natlog(double x)
    {
        if (x <= 0) 
        {
            throw new IllegalArgumentException("Number cannot be negative/zero.");
        }

        else
        {
            return Math.log(x);
        }
    }

    public static double powerf(double b, double e)
    {
        if (b == 0 && e <= 0) 
        {
            throw new IllegalArgumentException("When base is 0 exponent cannot be negative/zero.");
        }
        
        else
        {
            return Math.pow(b, e);
        }
    }

}

