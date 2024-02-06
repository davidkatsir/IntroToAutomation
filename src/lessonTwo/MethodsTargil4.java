package lessonTwo;

public class MethodsTargil4 {
    public static void main(String[] args) {
        // רמה בינונית
        // תרגיל 1
        System.out.println("The smallest number is: " + smallestOutOfThree(7, 9, 5));
        System.out.println("The smallest number is: " + smallestOutOfThree(3, 2, 1));
        System.out.println("The smallest number is: " + smallestOutOfThree(7, 19, 56));
        System.out.println("The smallest number is: " + smallestOutOfThree(76, 3, 565));
        System.out.println("The smallest number is: " + smallestOutOfThree(5, 5, 5));
        System.out.println("The smallest number is: " + smallestOutOfThree(5, 5, 2));
        System.out.println("The smallest number is: " + smallestOutOfThree(5, 4, 5));
        System.out.println("The smallest number is: " + smallestOutOfThree(5, 5, 6));
        System.out.println("The smallest number is: " + smallestOutOfThree(0, 0, 0));
        System.out.println("The smallest number is: " + smallestOutOfThree(0, -8, 1));
    }

    public static int smallestOutOfThree(int a, int b, int c) {
        int smallestNumber = a;
        if (a > b) {
            smallestNumber = b;
        }
        if (smallestNumber > c) {
            smallestNumber = c;
        }
        return smallestNumber;
    }

    // שאלה - למה לא נשתמש פה ב- Else If
    // ונכתוב את הפונקציה הקודמת כמו בדוגמא הבאה?
    // מה לא בסדר כאן?
//    public static int smallestOutOfThree(int a, int b, int c) {
//        int smallestNumber = a;
//        if (a > b) {
//            smallestNumber = b;
//        } else if (smallestNumber > c) {
//            smallestNumber = c;
//        }
//        return smallestNumber;
//    }

}