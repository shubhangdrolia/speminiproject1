import java.util.Scanner;
public class calculator {
    public int add(int x, int y)
    {
        int sum;
        sum = x + y;
        return sum;
    }

    public int sub(int x, int y)
    {
        int sub;
        sub = x - y;
        return sub;
    }

    public int mul(int x, int y)
    {
        int mul;
        mul = x * y;
        return mul;
    }

    public int div(int x, int y)
    {
        int div;
        div = x / y;
        return div;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b,c,selection;
        System.out.println("please enter any two number");
        a = scan.nextInt();
        b = scan.nextInt();

        System.out.println("Please enter 1 for addition");
        System.out.println("Please enter 2 for subtraction");
        System.out.println("Please enter 3 for multiplication");
        System.out.println("Please enter 4 for division");

        selection = scan.nextInt();

        while(selection > 4)
        {
            System.out.println("Invalid input please try again");
            System.out.println("Enter the input");
            selection = scan.nextInt();
        }

        calculator op = new calculator();

        if(selection == 1)
        {
            c = op.add(a,b);
            System.out.println("The result for addition is " +c);
        }
        else if(selection == 2)
        {
            c = op.sub(a,b);
            System.out.println("The result for subtraction is "+c);
        }
        else if(selection == 3)
        {
            c = op.mul(a,b);
            System.out.println("The result for multiplication is "+c);
        }
        else if(selection == 4)
        {
            c = op.div(a,b);
            System.out.println("The result for division is "+c);
        }
    }
}


