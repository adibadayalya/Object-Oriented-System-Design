class circle
{
    double xc,yc,radius;
    circle(double r)
    {
        this.xc =0;
        this.yc=0;
        this.radius = r;
    }
    circle(double x, double y, double r)
    {
        this.xc = x;
        this.yc = y;
        this.radius =r;
    }
    void printDetails()
    {
        System.out.println("The x-cordinate of the centre: "+xc);
        System.out.println("The y-cordinate of the centre: "+yc);
        System.out.println("The radius of the circle: "+radius);
    }
}
public class question_4 {
    public static void main(String[] args)
    {
        circle c1 = new circle(10.0);
        circle c2 = new circle(2.0, 1.0, 10.0);
        System.out.println("For circle 1");
        c1.printDetails();
        System.out.println("\nFor circle 2");
        c2.printDetails();
    }
}
