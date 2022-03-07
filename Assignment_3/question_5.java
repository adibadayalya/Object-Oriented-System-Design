interface K1{
    int intK =1;
    public void methodK();
}
interface K2 extends K1{
    public void methodK();
}
interface K3 extends K2{
    public void methodK();
}
class U implements K3{
    public void methodK(){
        System.out.println("The value of intK is "+intK);
    }
}
public class question_5 {
    public static void main(String[] args){
        U obj = new U();
        obj.methodK();
    }  
}
