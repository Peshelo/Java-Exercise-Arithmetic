package zw.co.rapiddata;

/**
 * Created by Peshel Gomo on 3/16/17.
 * This class is used to perform arithmetic operations
 * on two numbers
 */
public class Arithmetic {


    public static double add(double number1, double number2) {
        return number1 + number2;
    }

    public static double subtract(double number1, double number2) {
        return number1 - number2;
    }

    public static double multiply(double number1, double number2) {
        return number1 * number2;
    }
    public static double crazyoperator(double number1, double number2) {
        double subtractionResult = subtract(number1, number2);
        double additionResult = add(number1, number2);
        return multiply(subtractionResult,additionResult);
    }
}
