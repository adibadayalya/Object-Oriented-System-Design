public class question_2 {
    public static void main(String[] args){
        int n =200;
        boolean prime[] = new boolean[n+1];
        for(int i =0;i<n+1;i++)
        prime[i]=true;
        for(int p =2; p*p<=n;p++)
        {
            if(prime[p])
            {
                for(int i=p;i<=n;i+=p)
                {
                    prime[i]=false;
                }
            }
        }
        System.out.println("The prime numbers between 100 and 200 are:");
        for(int i=100;i<n+1;i++)
        {
            if(prime[i])
            System.out.print(i+" ");
        }
        System.out.print('\n');
    }
}
