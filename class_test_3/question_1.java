import java.util.*;
abstract class DessertItem{
    String item;
    public abstract void buy(double quantity);
}
class candy extends DessertItem{
    double quantity=0;
    public void buy(double q)
    {
        this.quantity+=q;
    }
    public String chek()
    {
        String s = String.valueOf(quantity);
        String r = s+" pounds of candy.";
        return r;
    }
}
class cookie extends DessertItem{
    double quantity=0;
    public void buy(double q)
    {
        this.quantity+=q;
    }
    public String chek()
    {
        String s = String.valueOf(quantity);
        String r = s+" dozens of cookies.";
        return r;
    }
}
class iceCream extends DessertItem{
    double quantity=0;
    public void buy(double q)
    {
        this.quantity+=q;
    }
    public String chek()
    {
        String s = String.valueOf(quantity);
        String r = s+" pounds of Ice Cream.";
        return r;
    }
}
class sundae extends iceCream{
    double quantity=0;
    public void buy(double q)
    {
        this.quantity+=q;
    }
    public String chek()
    {
        String s = String.valueOf(quantity);
        String r = s+" pounds of Sundae.";
        return r;
    }
}
class checkout{
    Vector<String> v = new Vector<>();
    void display()
    {
        if(this.v.size()==0)
        {
            System.out.println("No items bought!");   
        }
        else{
            System.out.println("The items bought are");
            for(int i=0;i<this.v.size();i++)
            {
                System.out.println(this.v.get(i));
            }
        }
    }
}
public class question_1 {
    public static void main(String[] args)
    {
        candy ca = new candy();
        cookie ck = new cookie();
        iceCream ic = new iceCream();
        sundae sn = new sundae();
        checkout bill = new checkout();
        double a,b,c,d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of candy to be bought in Pounds");
        a= sc.nextDouble();
        System.out.println("Enter the amount of cookies to be bought in dozens");
        b= sc.nextDouble();
        System.out.println("Enter the amount of ice cream to be bought in Pounds");
        c= sc.nextDouble();
        System.out.println("Enter the amount of sundae to be bought in Pounds");
        d= sc.nextDouble();
        ca.buy(a);
        ck.buy(b);
        ic.buy(c);
        sn.buy(d);
        if(ca.quantity>0)
        {
            bill.v.add(ca.chek());
        }
        if(ck.quantity>0)
        {
            bill.v.add(ck.chek());
        }
        if(ic.quantity>0)
        {
            bill.v.add(ic.chek());
        }
        if(sn.quantity>0)
        {
            bill.v.add(sn.chek());
        }
        bill.display();
        sc.close();
    }
}
