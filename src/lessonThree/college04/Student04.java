package lessonThree.college04;

public class Student04 {
    // Variables:

    private String name;
    private int age;
    private String email;
    private double grade;
    private boolean active;

    // Constructor
    public Student04(String name, int age, String email, double grade, boolean active) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.grade = grade;
        this.active = active;
    }
    // החתימה של האוביקט השתנתה כעת לכן
    // נחזור ל- MyCollege04 ונקים מחדש את Amit ואת הסטודנט החדש
    //**********************************

    // Getters and Setters
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

    // Methods
    public void calculateBirthYear(int currentYear) {
        System.out.println(name + "'s birth year is: " + (currentYear - age));
    }
    // נראה את המימוש ב- MyCollege04 שורה 40


}
