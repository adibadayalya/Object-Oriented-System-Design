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
        System.out.println("The length of the "+name+" is: "+length);
        System.out.println("Its color is "+color);
        System.out.println("Scales Type: "+scale);
    }
}
class question_1{
    public static void main(String args[])
    {
        shark f = new shark();
        f.length = 32;
        f.name="Tiger Shark";
        f.color="White";
        f.scale="Hard";
        f.display();
    }
}