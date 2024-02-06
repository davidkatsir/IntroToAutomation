package lessonTwo;

public class MethodsCircleArea02 {
    public static void main(String[] args) {
        System.out.println(circleArea(7));
        System.out.println(circleArea(10));
    }

    public static double circleArea(double radius) {
        double area = getPi() * radius * radius;
        // אנחנו קוראים למתודת getPi()
        //  ומשתמשים בערך שהיא מחזירה לנו לצורך החישוב שלנו
        return area;
    }

    public static double getPi() {
        return 3.14159265;
    }
}