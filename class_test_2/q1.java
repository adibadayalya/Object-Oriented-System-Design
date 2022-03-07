class fish 
{
    int length;
    String name;
    String color;
    String scale;
    void display()
    {
        System.out.println("The length of the "+name+" is: "+length);
        System.out.println("Its color is "+color);
        System.out.println("Scales Type: "+scale);
    }
}

class shark extends fish{
    int length;
    String name ;
    String color;
    String scale;
    void display()
    {
        System.out.println("Inside Shark class");
        System.out.println("Length of the "+name+" is: "+length);
        System.out.println("Color is "+color);
        System.out.println("Scale Type: "+scale);
    }
}
public class q1
{
	public static void main(String[] args) {
		shark sh = new shark();
        sh.length = 40;
        sh.name="White Shark";
        sh.color="White";
        sh.scale="Hard";
        sh.display();
	}
}
