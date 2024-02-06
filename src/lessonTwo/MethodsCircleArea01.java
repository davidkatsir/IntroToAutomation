package lessonTwo;

public class MethodsCircleArea01 {
    public static void main(String[] args) {
        double radius = 5;
//        double pi = 3.14159265;
//        double circleArea = pi * radius * radius;

        // במקום שנלך כל פעם לחפש כמה PI שווה
        // נכתוב מתודה שכל תפקידה הוא להחזיר לנו את PI

        double circleArea = getPi() * radius * radius;
        System.out.println(circleArea);
    }

    public static double getPi() {
//        double pi = 3.14159265;
//        return pi;
        // ואפשר לכתוב את זה כך ישירות
        return 3.14159265;
    }
}