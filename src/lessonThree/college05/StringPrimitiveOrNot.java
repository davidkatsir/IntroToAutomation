package lessonThree.college05;

import java.util.Locale;

public class StringPrimitiveOrNot {
    public static void main(String[] args) {

        // Is String a primitive variable after all?
        // אפשר לכתוב את המשתנה הבא כך:
        String address = "Nof Ha Galil, Tavor 5";

        // אבל אם String הוא קלאס, אז גם אפשר לכתוב את זה כך:
        // ושניהם בדיוק אותו דבר
        String address1 = new String("Nof Ha Galil, Hermon 23");

        // וזה אומר גם של- address יש גישה לכל המתודות של הקלאס String
        // דוגמאות
        if (address.equals("Nof Ha Galil, Tavor 5")) {
//        if (address.equals("Nof Ha Galil, Tavor 51")){
            System.out.println("You live in: " + address);
        } else {
            System.out.println("You live in: " + address1);
        }
        System.out.println(address.toUpperCase());
        System.out.println(address);
        System.out.println(address.length());
    }
}
