import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the First Number:");
        int firstNumber = input.nextInt();
        System.out.println("Enter the Second Number:");
        int secondNumber = input.nextInt();
        System.out.println("Enter the Operand:");
        char operand = input.next().charAt(0);
        double result;

        switch (operand){
            case '+':
                result = firstNumber + secondNumber;
                System.out.println("The Sum is:" + result);
                break;
            case '-':
                result = firstNumber - secondNumber;
                System.out.println("The difference is:" + result);
                break;
            case '/':
                result = firstNumber / secondNumber;
                System.out.println("The Quotient is:" + result);
                break;
            case '*':
                result = firstNumber * secondNumber;
                System.out.println("The Product is:" + result);
                break;
            default:
                System.out.println("INVALID OPERAND");
                break;
        }

    }
}