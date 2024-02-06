package lessonThree.college05;

import lessonOne.Variables;

public class Teacher05 {
    // נקים לקלאס משתנים ואז קונסטרקטור
    // ו- Getters & Setters
    // הכל בלחיצת כפתור
    // והפעם גם נקים פונקציה שתדפיס לנו הכל בצורה מרוכזת וקלה toString
    // הכל ע"י שימוש ב- GENERATE
    //*************************************

    // Variables
    private String name;
    private String email;
    private String course;

    // Constructor
    public Teacher05(String name, String email, String course) {
        this.name = name;
        this.email = email;
        this.course = course;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    // toString
    public String toString() {
        return "Teacher05 { " +
                "name=' " + name + '\'' +
                ", email=' " + email + '\'' +
                ", course=' " + course + '\'' +
                '}';
    }
    // Methods...

    // נעבור ל- MyCollege05 ונממש
}