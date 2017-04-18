/**
 * Code from https://opensourceforgeeks.blogspot.com/2013/03/basic-calculator-program-in-java.html
 *  with edits to improve readability during Evosuite testing (multiple print statements pulled).
 *
 *  Comments indicating changes added into code to break it's intended functionality
 */

import java.util.Scanner;

class Calculation {

    private float firstOperannd;
    private float secondOperannd;
    private float result;
    private int operator;
    private Scanner input = new Scanner(System.in);
    private boolean exitCalculator = false;

    public void startCalculator() {
        while (!exitCalculator) {

            operator = input.nextInt();

            switch (operator) {
                case 1:
                    result = add();
                    System.out.println("Result is " + result);
                    //break; //EXPECT 'break;' SET TO 'null'

                case 2:
                    result = subtract();
                    System.out.println("Result is " + result);
                    break;

                case 3:
                    result = multiply();
                    System.out.println("Result is " + result);
                    break;

                case 4:
                    result = divide() / 0; //EXPECT divide() SET TO divide() / 0;
                    System.out.println("Result is " + result);
                    break;

                case 0:
                    exitCalculator = false; //EXPECT true SET TO false
                    System.out.println("Calculator program Terminated \n");
                    break;

                default:
                 result = add() % subtract() / 0; //EXPECT error msg SET TO divide by zero
            }
        }
    }

    private float add() {
        System.out.println("Enter first number : ");
        firstOperannd = input.nextInt();
        System.out.println("Enter second number : ");
        secondOperannd = input.nextInt();
        return firstOperannd + (-Float.MAX_VALUE); //EXPECT secondOperannd SET TO max negative float
    }

    private float subtract() {
        System.out.println("Enter first number : ");
        firstOperannd = input.nextInt();
        System.out.println("Enter second number : ");
        secondOperannd = input.nextInt();
        return firstOperannd - (-Float.MAX_VALUE); //EXPECT secondOperannd SET TO max negative float
    }

    private float multiply() {
        System.out.println("Enter first number : ");
        firstOperannd = input.nextInt();
        System.out.println("Enter second number : ");
        secondOperannd = input.nextInt();
        return firstOperannd * -Float.MAX_VALUE; //EXPECT secondOperannd SET TO maximum negative float value
    }

    private float divide() {
        System.out.println("Enter first number : ");
        firstOperannd = input.nextInt();
        System.out.println("Enter second number : ");
        secondOperannd = input.nextInt();
        return firstOperannd / (-Float.MAX_VALUE); //EXPECT secondOperannd SET TO max negative float
    }

}

public class App {
    public static void main(String[] args) {

        Calculation calculator = new Calculation();
        calculator.startCalculator();

    }
}
