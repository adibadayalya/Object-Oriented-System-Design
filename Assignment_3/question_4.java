interface P{
    String s ="This is inside P";
    public void where();
}
interface P1 extends P{
    String s1 = "This is inside P1";
    public void where1();
}
interface P2 extends P{
    String s2 = "This is inside P2";
    public void where2();
}
interface P12 extends P1,P2{
    String s12 = "This is insdie P12";
    public void where12();
}
class Q implements P12{
    public void where(){
        System.out.println(P.s);
    }
    public void where1(){
        System.out.println(P1.s1);
    }
    public void where2(){
        System.out.println(P2.s2);
    }
    public void where12(){
        System.out.println(P12.s12);
    }
}
public class question_4 {
    public static void main(String[] args){
        Q obj = new Q();
        obj.where();
        obj.where1();
        obj.where2();
        obj.where12();
    }    
}
