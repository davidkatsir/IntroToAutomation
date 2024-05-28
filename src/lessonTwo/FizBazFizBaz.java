package lessonTwo;

//Problem Description
//You need to write a program that prints the numbers from 1 to a given number `n`.
// However, for multiples of 3, print "Fiz" instead of the number,
// for multiples of 5, print "Baz" instead of the number,
// and for multiples of both 3 and 5, print "FizBaz".

// * This problem helps to test basic programming skills, including loops, conditionals,
// and modulus operations. It also tests your ability to follow specifications
// and handle edge cases, such as different ranges of `n`.


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