import java.util.Scanner;

public class question_9 {
    public static void main(String[] args){
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        System.out.println("The factors of the number are:");
        for(int i=1;i<a/2+1;i++)
        {
            if(a%i==0)
            {
                System.out.println(i);
            }
        }
        System.out.println(a);
    }
}
