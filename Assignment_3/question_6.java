interface L1{

}
interface L2{

}
interface L3 extends L1,L2{

}
interface L4{

}
class X implements L3{

}
class W extends X implements L4{

}
public class question_6 {
    public static void main(String[] args){
        W obj = new W();
        System.out.println("Object obj (of class W) is of type X: "+(obj instanceof X));
        System.out.println("Object obj can implement methods of interface L1: "+(obj instanceof L1));
        System.out.println("Object obj can implement methods of interface L2: "+(obj instanceof L2));
        System.out.println("Object obj can implement methods of interface L3: "+(obj instanceof L3));
        System.out.println("Object obj can implement methods of interface L4: "+(obj instanceof L4));
    }
}
