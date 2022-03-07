import java.util.Scanner;

public class question_7 {
    public static void main(String[] args){
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        a = sc.nextInt();
        sc.close();
        boolean flag = true;
        if((a%2==0&&a!=2)||a<2)
        {
            System.out.println("The number is not prime");
            return;
        }
        for(int i=2;i*i<a;i++)
        {
            if(a%i==0)
            {
                flag=false;
                break;
            }
        } 
        if(flag)
        {
            System.out.println("The number is prime");
        }
        else 
        {
            System.out.println("The number is not prime");   
        }
    }
}
