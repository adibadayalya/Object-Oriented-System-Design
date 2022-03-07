//Aditya Badayalya, 510819056, Assignment 1
class circle
{
    int radius;
    double perimeter()
    {
        double perimet = 2*(3.14)*(this.radius);
        return perimet;        
    }
    double area()
    {
        double ar = (3.14)*(this.radius)*(this.radius);
        return ar;
    }
}
class question_3
{
    public static void main(String[]args){
        circle c = new circle();
        c.radius = 4;
        double p = c.perimeter();
        double a = c.area();
        System.out.println("The radius of cicle = "+ c.radius);
        System.out.println("The perimeter of cicle = "+ p);
        System.out.println("The area of cicle = "+ a);
    }
}