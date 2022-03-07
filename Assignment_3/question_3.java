interface LuminousObject{
    public void lightOff();
    public void lightOn();
}
class SolidObject{
    String obj;
}
class cone extends SolidObject{
    double baseRadius;
    double height;
}
class luminousCone extends cone implements LuminousObject{
    luminousCone(double r, double h)
    {
        super.obj="Cone";
        super.baseRadius=r;
        super.height=h;
    }
    public void lightOff()
    {
        System.out.println("Lights Turned Off");
    }
    public void lightOn()
    {
        System.out.println("Lights Turned On");
    }
    public void display()
    {
        System.out.println("The base radius of the Cone is "+super.baseRadius);
        System.out.println("The height of the Cone is "+super.height);
        lightOff();
        lightOn();
    }
}
class cube extends SolidObject{
    double len;
}
class luminousCube extends cube implements LuminousObject{
    luminousCube(double l)
    {
        super.obj="Cube";
        super.len=l;
    }
    public void lightOff()
    {
        System.out.println("Lights Turned Off");
    }
    public void lightOn()
    {
        System.out.println("Lights Turned On");
    }
    public void display()
    {
        System.out.println("The lenght of the side of the Cube is "+super.len);
        lightOff();
        lightOn();
    }
}
public class question_3 {
    public static void main(String[] args){
        luminousCone c = new luminousCone(4.0, 5.5);
        luminousCube cu = new luminousCube(12.0);
        c.display();
        cu.display();
    }
}
