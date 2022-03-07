import java.util.Scanner;

public class question_12 {
    public static void main(String[] args){
        String a;
        Scanner sc = new Scanner(System.in);
        a=sc.nextLine();
        sc.close();
        int count =0;
        int i =0;
        while(i<a.length())
        {
            char c = Character.toLowerCase(a.charAt(i));
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            {
                count++;
            }
            i++;
        }
        System.out.println("The number of vowels are "+count);
    }
}
