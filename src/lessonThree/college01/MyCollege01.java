package lessonThree.college01;

public class MyCollege01 {
    public static void main(String[] args) {
        Student01 amit = new Student01();
        // בשלב הזה האובייקט עמית כבר קיים אבל הוא ריק ולא מאותחל לכלום
        amit.name = "Amit";
        amit.age = 24;
        amit.email = "amit@gmail.com";
        amit.active = true;

        // עכשיו אני רוצה להדפיס ערכים של עמית
        System.out.println(amit.age);
        System.out.println(amit.email);

        // עכשיו נעדכן ערכים של עמית
        amit.age = 25;
        System.out.println(amit.age);

        // אם נכניס בטעות גיל לא תקין, האם בשלב הזה תהיה בעיה?
        amit.age = -25;
        System.out.println(amit.age);
        // זה כמובן יתקבל ולא תהיה שום בעיה
        // מה עושים?
        // יש מושג שנקרא Encapsulation
        // נלך שוב לקלאס סטודנט
    }
}