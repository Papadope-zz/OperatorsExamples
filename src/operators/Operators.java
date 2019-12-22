/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operators;

/**
 *
 * @author xrist
 */
public class Operators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1; // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);
        result = result * 10; //2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5;  // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3; // the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);

        // result = result + 1;
        result++; // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        result--; // 2 - 1 = 1;
        System.out.println("2 - 1 = " + result);

        // result = result + 2; 
        result += 2; //1 + 2 == 3;
        System.out.println("1 + 2 = " + result);

        //result = result * 10;
        result *= 10; // 3 * 10 = 30;
        System.out.println("3 * 10 = " + result);

        //result = result / 3;
        result /= 3; // 30 / 3 = 10;
        System.out.println("30 / 3 = " + result);

        //result = result - 2;
        result -= 2; //10 - 2 = 8;
        System.out.println("10 - 2 = " + result);

        boolean chicken = false;
        if (chicken == false) {
            System.out.println("It's not a chicken");
            System.out.println("And i am scared of chickens");
        }
        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }
        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }
        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }
        boolean isCar = false;
        if (isCar) {
            System.out.println("This is not supposed to happen");
        }
        //Ternary Operator
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }
        //Operator Challende
        double x = 20.00;
        double y = 80.00;
        double sumOfXAndY;
        sumOfXAndY = (x + y) * 100;
        System.out.println("Total is :" + sumOfXAndY);
        double remainder;
        remainder = sumOfXAndY % 40.00;
        System.out.println("Remainder is :" + remainder);
        boolean isNoRemainder = (remainder == 0) ? true : false;
        System.out.println(isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }

    }

}
