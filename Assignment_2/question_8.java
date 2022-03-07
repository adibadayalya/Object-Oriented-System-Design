class S1
{
    int s1 =2;
    void display()
    {
        System.out.println("Inside class S1");
        System.out.println("Value of s1: "+s1);
    }
}
class T1 extends S1
{
    int t1 = 4;
    void display()
    {
        S1  s = new S1();
        s.display();  
        System.out.println("Inside class T1");
        System.out.println("Value of t1: "+t1);
    }
}
class U1 extends T1
{
    int u1 = 6;
    void display()
    {
        T1  t = new T1();
        t.display();
        System.out.println("Inside class U1");
        System.out.println("Value of u1: "+u1);
    }
}
public class question_8 {
    public static void main(String[] args){
        U1 u = new U1();
        u.display();
    }
}
