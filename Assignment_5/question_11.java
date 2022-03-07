import java.util.Scanner;

public class question_11 {
    public static void main(String[] args){
        String s,t;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first String");
        s=sc.nextLine();
        System.out.println("Enter the second String");
        t=sc.nextLine();
        sc.close();
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        s="";
        t="";
        for(char c: a)
        {
            if(!Character.isWhitespace(c))
            {
                s+=c;
            }
        }
        for(char c:b)
        {
            if(!Character.isWhitespace(c))
            {
                t+=c;
            }
        }
        System.out.println("The first String without white spaces is: "+s);
        System.out.println("The second String without white spaces is: "+t);
        if(s.length()!=t.length())
        {
            System.out.println("The Strings are not equal");
            return;
        }
        a = s.toCharArray();
        b = t.toCharArray(); 
        boolean flag = true;
        for(int i=0;i<a.length;i++)
        {
            if(Character.isAlphabetic(a[i])&&Character.isAlphabetic(b[i]))
            {
                if(Character.toLowerCase(a[i])!=Character.toLowerCase(b[i]))
                {
                    flag = false;
                    break;
                }
            }
            else if(a[i]!=b[i])
            {
                flag = false;
                break;
            }
        }
        if(flag)
        {
            System.out.println("The Strings are equal(not considering the case difference)");
        }
        else 
        {
            System.out.println("The Strings are not equal");
        }
    }
}
