//Aditya Badayalya, 510819056, Assignment 4- Question-1;
import java.lang.Math;
import java.util.Scanner; 
class account{
    int bal;
    account(int k){
        this.bal = k;
    }
    void display()
    {
        System.out.println("The balance is "+this.bal);
    }
    void withdraw(int amount){
        int nw = this.bal - amount;
        try {
            if(nw<1000)
            {
                throw new Exception("Transaction not allowed");
            }
            else{
                this.bal=this.bal-amount;
                System.out.println("Transaction Successful!");
                System.out.println("The new balance is "+this.bal);
            }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("The transaction results in balance lower than 1000!");
        }
    }
}
public class question_1{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        account a[] = new account[4];
        for(int i=0;i<4;i++)
        {
            int temp = (int)(Math.random()*1000)+1000;
            a[i]=new account(temp);
        }
        int x = 1,y=1;
        while(y!=0)
        {
            System.out.println("Enter 1 to display balance:\nEnter 2 to make withdrawal:\nEnter 0 to exit:");
            y=sc.nextInt();
            if(y<0||y>2)
            {
                System.out.println("Error! Enter a valid inout: ");
                continue;
            }
            if(y==2)
            {
                System.out.println("Enter the account number from which the withdrawal is to be made: (0-3)");
                x=sc.nextInt();
                int amt;
                System.out.println("Enter the amount to be withdrawn: ");
                amt = sc.nextInt();
                a[x].withdraw(amt);
            }
            else if(y==1)
            {
                System.out.println("Enter the account number whose balance is to be displayed: (0-3)");
                x=sc.nextInt();
                a[x].display();
            }
        }
        sc.close();
    }
}
