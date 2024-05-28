package lessonTwo;

public class FizBazFizBaz {
    public static void main(String[] args) {
        int n = 20; // Example usage
        fizBazBizBaz(n);
    }

    public static void fizBazBizBaz(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizBaz");
            } else if (i % 5 == 0) {
                System.out.println("Fiz");
            } else if (i % 3 == 0) {
                System.out.println("Baz");
            } else {
                System.out.println(i);
            }
        }
    }
}