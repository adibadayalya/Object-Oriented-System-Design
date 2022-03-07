abstract class auto{
    String model;
    abstract void display();
}
interface AntiLockBrakes{
    public void antiLockBrakes();
}
interface CruiseControl{
    public void cruiseControl();
}
interface PowerSteering{
    public void powerSteering();
}
class Model1 extends auto implements PowerSteering{
    String name;
    Model1(String s)
    {
        this.name = s;
        super.model ="Model 1";
    }
    public void powerSteering(){
        System.out.println("This Model has Power Steering");
    }
    void display()
    {
        System.out.println("The car "+this.name+" is of type "+super.model);
        powerSteering();
    }
}
class Model2 extends auto implements AntiLockBrakes,CruiseControl{
    String name;
    Model2(String s)
    {
        this.name = s;
        super.model ="Model 2";
    }
    public void antiLockBrakes(){
        System.out.println("This Model has Anti-Lock Brakes");
    }
    public void cruiseControl(){
        System.out.println("This Model has Cruise Control");
    }
    void display()
    {
        System.out.println("The car "+this.name+" is of type "+super.model);
        antiLockBrakes();
        cruiseControl();        
    }
}
class Model3 extends auto implements CruiseControl{
    String name;
    Model3(String s)
    {
        this.name = s;
        super.model ="Model 3";
    }
    public void cruiseControl(){
        System.out.println("This Model has Cruise Control");
    }
    void display()
    {
        System.out.println("The car "+this.name+" is of type "+super.model);
        cruiseControl();
    }
}
public class question_2 {
    public static void main(String[] args)
    {
        Model1 a = new Model1("Car 1");
        Model2 b = new Model2("Car 2");
        Model3 c = new Model3("Car 3");
        a.display();
        b.display();
        c.display();
    }    
}
