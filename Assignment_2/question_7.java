class G
{
    static int x = 10;
}
class H extends G
{
    int x = 4;
    void display()
    {
        System.out.println("The value of x in G: "+G.x);
        System.out.println("The value of x in H: "+x);
    }
}

public class question_7 {
    public static void main(String[] args){
        H test = new H();
        test.display();
    }
}
