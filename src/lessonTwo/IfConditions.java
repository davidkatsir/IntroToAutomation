package lessonTwo;

public class IfConditions {
    public static void main(String[] args) {
        // Only print if the age is > 30
        int age = 40;
        // נרצה לעשות בדיקת גבולות (אנחנו QA אחרי הכל)
        // Positive test
//        age = 31;
        // Negative test
//        age = 30;
        if (age > 30) {
            System.out.println(age);
        }
        System.out.println("*************");

        // Print the age only if age > 30 and age < 60
        // Positive tests
//        age = 31;
//        age = 59;
        // Negative tests
//        age = 30;
//        age = 60;

        if (age > 30 && age < 60) {
            System.out.println(age);
        }
        System.out.println("*************");

        // Print the age only if age > 30 and age < 60
        // Positive tests
//        age = 29;
//        age = 61;
        // Negative tests
//        age = 30;
//        age = 60;
        if (age < 30 || age > 60) {
            System.out.println(age);
        }
        System.out.println("*************");

        // Print the age only if age is equal (=) to 42
//        age = 42;
//        age = 40;
        if (age == 42) {
            System.out.println(age);
        }
        System.out.println("*************");

        // Using Boolean statement's status (being True or False) instead of explicit word (true / false), in an IF condition
        boolean result = age != 40;
        System.out.println(result);

        if (result) {                          // This is equivalent as writing:  if(result == true)
            System.out.println(age);
        }
        System.out.println("*************");
    }
}
