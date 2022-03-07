//Aditya Badayalya, 510819056
class Student{
    static void Compute(String name,int physics, int chemistry, int mathematics)
    {
      float total = physics + chemistry + mathematics;
      System.out.println("The percentage obtained by "+name+" are: ");
      System.out.println(total/3);
    }
}

public class question_2 {
    public static void main(String[] args)
    {
        Student.Compute("A", 80, 100, 90);
        Student.Compute("B", 83, 60, 45);
        Student.Compute("C", 80, 100, 76);
        Student.Compute("D", 90, 100, 90);
        Student.Compute("E", 80, 60, 70);
    }
}
