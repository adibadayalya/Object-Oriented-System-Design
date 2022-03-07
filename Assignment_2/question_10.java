abstract class Airplane
{
    String serialNumber;
    String capacity;
    public abstract String toString();
}
class B747 extends Airplane
{
    B747(String a,String b)
    {
        super.serialNumber=a;
        super.capacity=b;
    }
    void display()
    {
        System.out.println("B747----> Serial Number: "+super.serialNumber+", Capacity: "+super.capacity);
    }
    public String toString()
    {
        return ("Type: B747, Serial Number: "+super.serialNumber+", Capacity: "+super.capacity);
    }
}

class B757 extends Airplane
{
    B757(String a,String b)
    {
        super.serialNumber=a;
        super.capacity=b;
    }
    void display()
    {
        System.out.println("B757----> Serial Number: "+super.serialNumber+", Capacity: "+super.capacity);
    }
    public String toString()
    {
        return ("Type: B757, Serial Number: "+super.serialNumber+", Capacity: "+super.capacity);
    }
}

class B767 extends Airplane
{
    B767(String a,String b)
    {
        super.serialNumber=a;
        super.capacity=b;
    }
    void display()
    {
        System.out.println("B767----> Serial Number: "+super.serialNumber+", Capacity: "+super.capacity);
    }
    public String toString()
    {
        return ("Type: B767, Serial Number: "+super.serialNumber+", Capacity: "+super.capacity);
    }
}

public class question_10 {
    public static void main(String[] args){
        B747 p1 = new B747("BBDA2331", "1000");
        String i = p1.toString();
        B757 p2 = new B757("XDA2331", "1230");
        String j = p2.toString();
        B767 p3 = new B767("POY331", "1405");
        String k = p3.toString();
        p1.display();
        p2.display();
        p3.display();
        System.out.println("toString() inside B747 returns-> "+i);
        System.out.println("toString() inside B757 returns-> "+j);
        System.out.println("toString() inside B767 returns-> "+k);
    }
}
