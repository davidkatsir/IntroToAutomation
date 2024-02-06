package lessonTwo;

public class MethodsSumNum {
    public static void main(String[] args) {
        sumNum(10, 20);
        int a = sumNum1(10, 20);
        int b = sumNum1(20, 40);
        int c = a + b;
        System.out.println(c);
        // אפשר לקבל את אותו הדבר גם אם נכתוב את זה כך -
        System.out.println(sumNum1(sumNum1(10, 20), sumNum1(20, 40)));
    }

    // מתודה שמקבלת ערכים אבל לא מחזירה כלום
    public static void sumNum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println(sum);
    }

    // מתודה שמקבלת ערכים וכן מחזירה ערך
    // שאתו אפשר לעשות פעולות המשך
    public static int sumNum1(int num1, int num2) {
        int sum1 = num1 + num2;
        return sum1;
    }
}
