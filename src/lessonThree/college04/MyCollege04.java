package lessonThree.college04;

public class MyCollege04 {
    public static void main(String[] args) {
//        Student04 amit = new Student04();
//        amit.setName("Amit");
//        amit.setAge(24);
//        amit.setEmail("amit@gmail.com");
//        amit.isActive();
//        amit.setGrade(95);
//        System.out.println(amit.getName());
//        System.out.println(amit.getAge());
//        System.out.println(amit.getEmail());
//        System.out.println(amit.getGrade());

        // אם עכשיו נרצה להקים סטודנט חדש בשם אלעד
        // נצטרך להכניס את כל הנתונים שוב כמו עם AMIT?
        // זה לא ממש הגיוני
        // לשם כך נועד ה- Constructor
        // נעבור שוב ל- Student04
        // ונקים אותה שם מיד מתחת ל- Variables
        // נקים כעת את AMIT מחדש עם הקונסטרקטור החדש
        Student04 amit = new Student04("Amit", 24, "amit@gmail.com", 95, true);
        System.out.println(amit.getName());
        System.out.println(amit.getAge());
        System.out.println(amit.getEmail());
        System.out.println(amit.getGrade());

        Student04 elad = new Student04("Elad", 25, "elad@gmail.com", 98, true);
        System.out.println(elad.getName());
        System.out.println(elad.getAge());
        System.out.println(elad.getEmail());
        System.out.println(elad.getGrade());

        // אחרי שהקמנו Getters & Setters וקונסטרקטור
        // כחלק מ- OOP, בקלאס סטודנט
        // עכשיו אנחנו יכולים להקים שם עוד מתודות לפי הצורך
        // נעבור שוב ל- Student04 לשורה 69

        amit.calculateBirthYear(2024);
        elad.calculateBirthYear(2024);

        // כפי שאנחנו רואים, אפשר להפעיל על האובייקטים
        // את כל היכולות של הקלאס שלו

    }
}
