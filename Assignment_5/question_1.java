public class question_1 {
    public static void main(String[] args)
    {
        double a[][] = new double[4][11];
        double p =0.0;
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<11;j++)
            {
                a[i][j]=p;
                p++;
            }
        }
        double sum =0;
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<11;j++)
            {
                sum+=a[i][j];
            }
        }
        System.out.println("The sum is: "+sum);
        double average = sum/44;
        System.out.println("The average is "+average);
    }
}
