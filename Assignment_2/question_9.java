abstract class Fruit
{
    String color;
    public abstract String toString();
}
class Apple extends Fruit
{
    Apple(String s)
    {
        super.color = s;
    }
    void display()
    {
        System.out.println(" Fruit: Apple, Color: "+super.color);
    }
    public String toString()
    {
        return "Fruit: Apple, Color: "+super.color;
    }
}
class Banana extends Fruit
{
    String color;
    Banana(String s)
    {
        super.color = s;
    }
    void display()
    {
        System.out.println(" Fruit: Banana, Color: "+super.color);
    }
    public String toString()
    {
        return "Fruit: Banana, Color: "+super.color;
    }
}
class Orange extends Fruit
{
    String color;
    Orange(String s)
    {
        super.color = s;
    }
    void display()
    {
        System.out.println(" Fruit: Orange, Color: "+super.color);
    }
    public String toString()
    {
        return "Fruit: Orange, Color: "+super.color;
    }
}
class Strawberry extends Fruit
{
    String color;
    Strawberry(String s)
    {
        super.color = s;
    }
    void display()
    {
        System.out.println(" Fruit: Strawberry, Color: "+super.color);
    }
    public String toString()
    {
        return "Fruit: Strawberry, Color: "+super.color;
    }
}
public class question_9 {
    public static void main(String[] args){
        Apple a = new Apple("Red");
        String i = a.toString();
        a.display();
        Banana b = new Banana("Yellow");
        String j = b.toString();
        b.display();
        Orange o = new Orange("Orange");
        String k = o.toString();
        o.display();
        Strawberry s = new Strawberry("Red");     
        String l = s.toString();
        s.display();
        System.out.println("toString() inside Apple returns-> "+i);
        System.out.println("toString() inside Banana returns-> "+j);
        System.out.println("toString() inside Orange returns-> "+k);
        System.out.println("toString() inside Strawberry returns-> "+l);
    }
}
