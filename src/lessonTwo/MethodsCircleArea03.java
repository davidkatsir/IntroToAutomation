package lessonTwo;

public class MethodsCircleArea03 {
    public static void main(String[] args) {
        System.out.println(circleArea(7));
        System.out.println(circleArea(10));
    }

    public static double circleArea(double radius) {
        //  את מה שכתבנו בגרסה הקודמת בצורה גולמית -
        //  double area = getPi() * radius * radius;
        //  ניתן לעשות ע"י שימוש בקלאס Math (מתמטיקה) מובנה
        // ואז כבר לא יהיה לנו צורך בפונקציה getPi שכתבנו קודם

        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }
}