public class question_4 {
    public static void main(String[] args){
        String s ="abcdefghijklmnop";
        String a="";
        for(int i=s.length()-10;i<s.length();i++)
        {
            a+=s.charAt(i);
        }
        System.out.println("The substring formed by the last 10 characters is: "+a);
    }    
}
