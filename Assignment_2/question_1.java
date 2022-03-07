class question_1{
    public static void main(String[] args)
    {
        int a = 0,b=1;
        int c =1;
        for(int i=0;i<15;i++)
        {
            System.out.print(b+" ");
            c =a +b;
            a=b;
            b=c;
        }
        System.out.print("\n");
    }
}