package lessonTwo;

public class ConditionsTargil1 {
    public static void main(String[] args) {
        // רמה בסיסית
        // תרגיל 1
        int age = 23;
        age = 17;
        if (age < 18) {
            System.out.println("You are a minor");
        }
        age = 67;
        if (age > 66) {
            System.out.println("You are a Pensioner");
        }
        age = 18;
        if (age == 18) {
            System.out.println("You are 18 years old");
        }
    }
}