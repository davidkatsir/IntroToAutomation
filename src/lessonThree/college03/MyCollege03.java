package lessonThree.college03;

public class MyCollege03 {
    public static void main(String[] args) {
        Student03 amit = new Student03();
        // ועכשיו נשתמש ב- SET השונים לעדכון כל משתנה
        amit.setName("Amit");
        amit.setAge(24);
        amit.setEmail("amit@gmail.com");
        amit.isActive();

        System.out.println(amit.getAge());
        System.out.println(amit.getEmail());
        amit.setAge(-25);
        System.out.println(amit.getAge());
    }
}
