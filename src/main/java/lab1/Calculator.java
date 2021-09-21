package lab1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    public Calculator() throws IOException {
        System.out.println("Task 9");
        System.out.println("Calculator: ");

        int intN1, intN2;
        double doubleN1, doubleN2;
        char op;

        CustomDouble result;

        while (true) {
            final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter number 1 :  ");
            System.out.println("int part :  ");
            intN1 = Integer.parseInt(br.readLine());
            System.out.println("double part :  ");
            doubleN1 = Double.parseDouble(br.readLine());
            final CustomDouble number1 = new CustomDouble(intN1, doubleN1);

            System.out.println("Enter the sign of the arithmetic operation : ");
            op = br.readLine().charAt(0);
            if (op == 'q') {
                break;
            }

            System.out.println("Enter number 2 :  ");
            System.out.println("int part :  ");
            intN2 = Integer.parseInt(br.readLine());
            System.out.println("double part :  ");
            doubleN2 = Double.parseDouble(br.readLine());
            final CustomDouble number2 = new CustomDouble(intN2, doubleN2);


            if (op == '+') {
                result = number1.sum(number2);
                System.out.println("Result: " + result.toDouble());
            } else if (op == '-') {
                result = number1.diff(number2);
                System.out.println("Result: " + result.toDouble());
            } else if (op == '*') {
                result = number1.mul(number2);
                System.out.println("Result: " + result.toDouble());
            } else if (op == '/') {
                if (number2.toDouble() == 0.0) {
                    System.out.println("Can not divide by 0");
                } else {
                    result = number1.div(number2);
                    System.out.println("Result: " + result.toDouble());
                }
            }

        }


    }



}
