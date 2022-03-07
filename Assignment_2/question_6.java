class M 
{
    float f= 4;
    String s="This is a String";
}
class N extends M
{
    double y = 10.1;
}
public class question_6 {
    public static void main(String[] args)
    {
        N test = new N();
        System.out.println("The value of the float is: "+test.f);
        System.out.println("The value of the String is: "+test.s);
        System.out.println("The value of the double is: "+test.y);
    }
}
