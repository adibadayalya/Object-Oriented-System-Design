import java.lang.Math;
import java.text.DecimalFormat;
public class question_3 {
    public static void main(String[] args){
        int a = 45, b=89;
        int c = a*a + b*b;
        double hypo = Math.sqrt(c);
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        System.out.print("The hypotenuse for the right angled triangle with sides 45 and 89 is: ");
        System.out.println(numberFormat.format(hypo)); 
    }
}
