package lessonTwo;

public class MethodsTargil5 {
    public static void main(String[] args) {
        // רמה בינונית
        // תרגיל 2
        System.out.println(isZugi(8));
        System.out.println(isZugi(9));
        System.out.println(isZugi(0));
        System.out.println(isZugi(-2));
        System.out.println(isZugi(-7));
    }

    public static boolean isZugi(int myNum) {
        boolean evenOrOdd = myNum % 2 == 0;
        return evenOrOdd;
    }
}