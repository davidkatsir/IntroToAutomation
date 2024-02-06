package lessonTwo;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number ");
        int myNum = s.nextInt();

        while (myNum != -1) {
            System.out.println("Enter a number ");
            myNum = s.nextInt();
        }
        System.out.println("End");
    }
}
