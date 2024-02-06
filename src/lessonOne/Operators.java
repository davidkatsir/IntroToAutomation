package lessonOne;

public class Operators {
    public static void main(String[] args) {

        long number;
        number = 20 + 30;
        System.out.println(number);

        number = 30 * 3 + 5;
        System.out.println(number);

        number = (10 + 5) * 3;
        System.out.println(number);

        number = number + 10;
        System.out.println(number);

        number++; // Is same as ===> number = number + 1;
        System.out.println(number);

        number--; // Is same as ===> number = number - 1;
        System.out.println(number);

        number = 10;
        number *= 7;   // Is same as ===> number = number * 7;
        System.out.println(number);

        // We can do the same with all other operators

        number = 10;
        number += 7;
        System.out.println(number);

        number = 10;
        number %= 7;
        System.out.println(number);

        // Modulo example
        number = 10 % 2;
        System.out.println(number);

        // variables and operators
        int a = 15;
        int b = 25;
        int c = a + b;
        System.out.println(c);

    }
}
