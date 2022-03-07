import java.util.*;
class rock
{
    int number;
    int mass;
    void print()
    {
        System.out.println("The mass of rock "+number+" is "+mass);
    }
}
public class question_5 {
    public static void main(String[] args){
        Random rand = new Random();
        int upperbound = 11;
        rock[] rockArray = new rock[10];
        for(int i=0;i<10;i++)
        {
            rockArray[i]=new rock();
            rockArray[i].number=i+1;
            rockArray[i].mass=rand.nextInt(upperbound);
        }
        for(int i =0;i<10;i++)
        {
            rockArray[i].print();
        }
    }
}
