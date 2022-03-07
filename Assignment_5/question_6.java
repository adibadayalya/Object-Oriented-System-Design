public class question_6 {
    public static void main(String[] args){
        String s ="Adi112aad2334";
        char [] arr = s.toCharArray();
        int dig=0,letter=0;
        for(char c:arr)
        {
            if(Character.isDigit(c))
            dig++;
            else if(Character.isAlphabetic(c))
            letter++;
        }
        System.out.println("In the string "+s);
        System.out.println("The number of digits are: "+dig);
        System.out.println("The number of letters are: "+letter);
    }
}
