public class question_2 {
    public static void main(String[] args){
        int mat[][] = new int[3][2];
        int sum[] = new int[3];
        int k =0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<2;j++)
            {
                mat[i][j]=k;
                k++;
            }
        }
        for(int i=0;i<3;i++)
        {
            int s =0;
            for(int j=0;j<2;j++)
            {
                s+=mat[i][j];
            }
            sum[i]=s;
        }
        double avg[]= new double[3];
        int s=0;
        for(int i=0;i<3;i++)
        {
            avg[i]=(double)(sum[i])/2;
            s+=sum[i];
        }
        double grandAvg = (double)s/6;
        System.out.println("The row wise average is:");
        for(int i=0;i<3;i++)
        {
            System.out.println("For row "+(i+1)+" the average is "+avg[i]);
        }
        System.out.print("The grand average is "+grandAvg);
    }
}
