//Aditya Badayalya, 510819056, Assignment 1
class Car{
    String type;
    String color;
    String make;
    Integer cost;
    String gear_type;
    Integer mileage;
    public Car(String type, String color, String make, Integer cost,String gear_type,Integer mileage){
        this.type = type;
        this.color = color;
        this.make = make;
        this.cost = cost;
        this.gear_type=gear_type;
        this.mileage=mileage; 
    }
}
public class question_2 {
    public static void main(String[] args){
        Car car = new Car("automatic","blue","chevvy",2000000,"stick shift",30);
        System.out.println(car.type);
        System.out.println(car.color);
        System.out.println(car.make);
        System.out.println(car.cost);
        System.out.println(car.gear_type);
        System.out.println(car.mileage);
    }
}
