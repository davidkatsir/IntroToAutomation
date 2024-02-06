package lessonThree.college05;

public class Student05 {
    // Variables:

    private String name;
    private int age;

    private String email;

    private double grade;
    private boolean active;
    // Constructor

    public Student05(String name, int age, String email, double grade, boolean active) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.grade = grade;
        this.active = active;
    }
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

    // toString
    public String toString() {
        return "Student05 { " +
                "name=' " + name + '\'' +
                ", age= " + age +
                ", email=' " + email + '\'' +
                ", grade= " + grade +
                ", active= " + active +
                '}';
    }
}