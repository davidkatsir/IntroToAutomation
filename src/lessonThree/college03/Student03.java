package lessonThree.college03;

public class Student03 {
    // Variables:

    // נהפוך את כל המשתנים ל- PRIVATE
    // ונייצר GET ו- SET
    // כמעט בלחיצת כפתור אחת - עכבר ימין ו- GENERATE

    private String name;
    private int age;
    private String email;
    private double grade;
    private boolean active;


    // Getters and Setters
    // לכל אחד נוסיף בעצמנו את הואלידציות לפי הנדרש
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            System.err.println("The Age must be >= 0 and <= 120");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }


}
