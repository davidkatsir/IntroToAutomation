package lessonThree.college05;

public class MyCollege05 {
    public static void main(String[] args) {
        Student05 amit = new Student05("Amit", 24, "amit@gmail.com", 95, true);
        System.out.println(amit.getName());
        System.out.println(amit.getAge());
        System.out.println(amit.getEmail());
        System.out.println(amit.getGrade());

        Student05 elad = new Student05("Elad", 25, "elad@gmail.com", 98, true);
        System.out.println(elad.getName());
        System.out.println(elad.getAge());
        System.out.println(elad.getEmail());
        System.out.println(elad.getGrade());
        amit.calculateBirthYear(2024);
        elad.calculateBirthYear(2024);

        // ועכשיו נממש את Teacher
        Teacher05 david = new Teacher05("David", "david@gmail.com", "Automation");
        Teacher05 kobi = new Teacher05("Kobi", "kobi@gmail.com", "QA");

        System.out.println(david.toString());
        System.out.println(kobi.toString());

        // נייצר toString גם עבור Student05 (שם בשורה 75) ונממש כאן
        System.out.println(amit.toString());
        System.out.println(elad.toString());
    }
}
