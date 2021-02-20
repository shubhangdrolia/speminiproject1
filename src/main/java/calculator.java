import java.lang.Math;
import java.util.Scanner;
public class calculator {
    public double add(double x, double y)
    {
        double sum;
        sum = x + y;
        return sum;
    }

    public double sub(double x, double y)
    {
        double sub;
        sub = x - y;
        return sub;
    }

    public double mul(double x, double y)
    {
        double mul;
        mul = x * y;
        return mul;
    }

    public double div(double x, double y)
    {
        double div;
        div = x / y;
        return div;
    }

    public double fact(double x)
    {
        double i, fact = 1;
        for(i = 1; i <= x; i++)
            fact = fact * i;
        return fact;
    }

    public double squ(double x)
    {
        double squ;
        squ = x * x;
        return squ;
    }

    public double squareroot(double x)
    {
        double root;
        root = Math.sqrt(x);
        return root;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, b, c, selection;
        double d;
        System.out.println("Please enter 1 for addition");
        System.out.println("Please enter 2 for subtraction");
        System.out.println("Please enter 3 for multiplication");
        System.out.println("Please enter 4 for division");
        System.out.println("Please enter 5 for factorial");
        System.out.println("Please enter 6 for square");
        System.out.println("Please enter 7 for square root");
        selection = scan.nextInt();
        calculator op = new calculator();
        if (selection <= 4) {
            System.out.println("please enter any two number");
            a = scan.nextInt();
            b = scan.nextInt();


            while (selection > 4) {
                System.out.println("Invalid input please try again");
                System.out.println("Enter the input");
                selection = scan.nextInt();
            }

            if (selection == 1) {
                c = op.add(a, b);
                System.out.println("The result for addition is " + c);
            } else if (selection == 2) {
                c = op.sub(a, b);
                System.out.println("The result for subtraction is " + c);
            } else if (selection == 3) {
                c = op.mul(a, b);
                System.out.println("The result for multiplication is " + c);
            } else if (selection == 4) {
                c = op.div(a, b);
                System.out.println("The result for division is " + c);
            }
        }
        else if(selection > 4 && selection <=7)
        {
            System.out.println("please enter any number");
            d = scan.nextInt();
            if(selection == 5)
            {
                c = op.fact(d);
                System.out.println("The result of factorial is "+c);
            }

            else if(selection == 6)
            {
                c = op.squ(d);
                System.out.println("The result of square is "+c);
            }

            else if(selection == 7)
            {
                double x;
                x = op.squareroot(d);
                System.out.println("The result of square root is "+x);
            }
        }
    }
}


