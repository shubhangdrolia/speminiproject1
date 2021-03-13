import java.lang.Math;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class calculator {
    public double add(double x, double y)
    {
        logger.info("[SUM OF - " + x + " AND] " + y);
        double sum;
        sum = x + y;
        logger.info("[RESULT - sum] - " + sum);
        return sum;
    }

    public double sub(double x, double y)
    {
        logger.info("[SUBTRACTION OF - " + x + " AND] " + y);
        double sub;
        sub = x - y;
        logger.info("[RESULT - SUBTRACTION] - " + sub);
        return sub;
    }

    public double mul(double x, double y)
    {
        logger.info("[MULTIPLY OF - " + x + " AND] " + y);
        double mul;
        mul = x * y;
        logger.info("[RESULT - MULTIPLICATION] - " + mul);
        return mul;
    }

    public double div(double x, double y)
    {
        logger.info("[DIVISION OF - " + x + " AND] " + y);
        double div;
        div = x / y;
        logger.info("[RESULT - DIVISION] - " + div);
        return div;
    }

    public double fact(double x)
    {
        logger.info("[FACTORIAL] - " + x);
        double i, fact = 1;
        for(i = 1; i <= x; i++)
            fact = fact * i;
        logger.info("[RESULT - FACTORIAL] - " + fact);
        return fact;
    }

    public double squ(double x)
    {
        logger.info("[SQ] - " + x);
        double squ;
        squ = x * x;
        logger.info("[RESULT - SQ ROOT] - " + x);
        return squ;
    }

    public double squareroot(double x)
    {
        logger.info("[SQ ROOT] - " + x);
        double root;
        root = Math.sqrt(x);
        logger.info("[SQ ROOT] - " + x);
        return root;
    }

    public double power(double x, double y)
    {
        logger.info("[POWER - " + x + " RAISED TO] " + y);
        double c;
        c = Math.pow(x,y);
        logger.info("[RESULT - POWER] - " + c);
        return c;
    }


    public double logarithm(double x)
    {
        logger.info("[LOGARITHM] - " + x);
        double root;
        root = Math.log(x);
        logger.info("[RESULT - LOGARITHM] - " + x);
        return root;
    }

    private static final Logger logger = LogManager.getLogger(calculator.class);

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, b, c, selection;
        double d;
        while(true){
            System.out.println("--------------------------Welcome---------------------------");
            System.out.println("Please enter 0 for power");
            System.out.println("Please enter 1 for addition");
            System.out.println("Please enter 2 for subtraction");
            System.out.println("Please enter 3 for multiplication");
            System.out.println("Please enter 4 for division");
            System.out.println("Please enter 5 for factorial");
            System.out.println("Please enter 6 for square");
            System.out.println("Please enter 7 for square root");
            System.out.println("Please enter 8 for Log");
            System.out.println("Please enter 9 for Exit");
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
                if (selection == 0) {
                    c = op.power(a, b);
                    System.out.println("The result for power is " + c);
                } else if (selection == 1) {
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
            } else if (selection > 4 && selection <= 8) {
                System.out.println("please enter any number");
                d = scan.nextInt();
                if (selection == 5) {
                    c = op.fact(d);
                    System.out.println("The result of factorial is " + c);
                } else if (selection == 6) {
                    c = op.squ(d);
                    System.out.println("The result of square is " + c);
                } else if (selection == 7) {
                    double x;
                    x = op.squareroot(d);
                    System.out.println("The result of square root is " + x);
                } else if (selection == 8) {
                    double x;
                    x = op.logarithm(d);
                    System.out.println("The result of logarithm is " + x);
                }

            } else if (selection == 9) {
                System.out.println("Thank you !!");
                break;
            }
        }
    }
}


