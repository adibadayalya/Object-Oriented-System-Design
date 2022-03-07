interface Material{
    String METAL = "Metal";
    String RUBBER = "Rubber";
    String PLASTIC = "Plastic";
}
abstract class MatObject{
    String material;
    abstract void type();
}
class Ball extends MatObject implements Material{
    String name;
    Ball(String a, String s)
    {
        this.name =a ;
        super.material = s;
    }
    public void type(){
        System.out.println("The Ball "+this.name+" is made up of "+super.material);
    }
}
class Coin extends MatObject implements Material{
    String name;
    Coin(String a, String s)
    {
        this.name = a;
        super.material = s;
    }
    public void type(){
        System.out.println("The Coin "+this.name+" is made up of "+super.material);
    }
}
class Ring extends MatObject implements Material{
    String name;
    Ring(String a, String s)
    {
        this.name = a;
        super.material = s;
    }
    public void type(){
        System.out.println("The Ring "+this.name+" is made up of "+super.material);
    }
}
public class question_1 {
    public static void main(String[] args)
    {
        Ball a = new Ball("A",Material.RUBBER);
        Ring b = new Ring("B",Material.PLASTIC);
        Coin c = new Coin("C",Material.METAL);
        a.type();
        b.type();
        c.type();
    }
}
