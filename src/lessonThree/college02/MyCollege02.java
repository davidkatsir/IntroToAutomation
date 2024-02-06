package lessonThree.college02;

public class MyCollege02 {
    public static void main(String[] args) {
        Student02 amit = new Student02();
        amit.name = "Amit";
//        amit.age = 24;
        amit.setAge(24);
        amit.email = "amit@gmail.com";
        amit.active = true;

//        System.out.println(amit.age);
        System.out.println(amit.email);
        amit.setAge(-25);
//        System.out.println(amit.age);

        // בשלב הזה אני עדיין לא יכול להדפיס את הגיל
        // כי אין לי גישה גם למידע הזה לטובת הדפסה
        // בשביל זה נחזור לקלאס Student02 ונכתוב מתודת GET
        // וננסה להדפיס שוב אבל הפעם תוך שימוש ב- GET

        System.out.println(amit.getAge());

        // עכשיו מזה אפשר להבין שאנחנו נצטרך בעצם לעשות את ההגנה הזו
        // לכל המשתנים ואת זה עכשיו נראה בגרסה מס' 03 של הקבצים
        // נמשיך ב- college03
    }
}