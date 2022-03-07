public class question_3 {
    public static void main(String[] args)
    {
        int flag =1;
        for(int i=0;i<args.length;i++)
        {
            String s = args[i];
            if(s.charAt(0)<'A'||s.charAt(0)>'Z')
            {
                System.out.println("Error! Argument number "+(i+1)+" ("+args[i]+") does not begin with a capital letter!");
                flag=0;
            }
        }
        if(flag==1)
        {
            System.out.println("No Errors found!");
        }
    }
}
