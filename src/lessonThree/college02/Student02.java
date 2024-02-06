package lessonThree.college02;

public class Student02 {
    // Variables:
    String name;

    private int age;

    // בהמשך משורה 26 בקלאס MyCollege01
    String email;
    double grade;
    boolean active;
    // נכתוב מתודה שתתן לנו גישה לשינוי age
    // כיוון שהמתודה נמצאת באותו קלאס, כן יש לה גישה ל- age

    public void setAge(int age1) {
        if (age1 >= 0 && age1 <= 120) {
            age = age1;
        } else {
            System.err.println("The Age must be >= 0 and <= 120");
        }
    }
    // עכשיו נחזור ל- MyCollege02
    // ונשנה שם את הגישה לגיל של עמית
    //************************************


    // המשך מ- MyCollege02 שורה 19
    public int getAge() {
        return age;
    }

}