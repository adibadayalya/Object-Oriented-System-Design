//Aditya Badayalya, 510819056, Assignment 1
class distance
{
    double addDistance(double a, double b)
    {
        double c = a+b;
        return c;
    }
}
public class question_4 {
    public static void main(String[] args){
        double a = 12.38;
        double b = 14.62;
        distance d = new distance();
        double c = d.addDistance(a, b);
        System.out.println("a = "+a+" b = "+b);
        System.out.println("The sum is "+c);
    }
}
