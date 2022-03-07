interface Shape2D{
    public double getArea();
}
interface Shape3D{
    public double getVolume();
}
interface Point3D{
    public double[] getCoordinates();
}
abstract class shape{
    abstract void display();
}
class circle extends shape implements Shape2D{
    double radius;
    double area;
    circle(double r)
    {
        this.radius = r;
        this.area = 2*(22)*this.radius*this.radius/7;
    }
    public double getArea()
    {
        return this.area;
    }
    public void display(){
        System.out.println("The raidus of the Circle is: "+this.radius);
        double k = this.getArea();
        System.out.println("The Area of the Circle is: "+k);
    }
}
class sphere extends shape implements Shape3D{
    double radius;
    double volume;
    sphere(double r)
    {
        this.radius = r;
        this.volume = 4*this.radius*this.radius*this.radius*22/21;
    }
    public double getVolume()
    {
        return this.volume;
    }
    public void display(){
        System.out.println("The raidus of the Sphere is: "+this.radius);
        double k = this.getVolume();
        System.out.println("The Volume of the Sphere is: "+k);
    }
}
public class question_7 {
    public static void main(String[] args){
        sphere sp = new sphere(10.0);
        circle c = new circle(5.5);
        sp.display();
        c.display();
    }    
}
