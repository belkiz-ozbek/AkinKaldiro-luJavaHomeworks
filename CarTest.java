package cartest;

public class CarTest {

    public static void main(String[] args) {

        Car car1 = new Car();

        System.out.println("When the car stands still.");
        car1.make = "BMW";
        car1.model = "C200";
        car1.year = "2019";
        car1.distance = 0;
        car1.speed = 0;
        String info = car1.getInfo();
        System.out.println(info);
        
        System.out.println("\nWhen the car moves.");
        car1.accelerate(125);
        car1.go(100);
        car1.go(50);
        System.out.println(car1.getInfo());
        car1.stop();
        System.out.println(car1.getInfo());  
        System.out.println();

        Car car2 = new Car();
        car2.make = "MERCEDES";
        car2.model = "i8";
        car2.distance = 10_000;
        car2.speed = 160;
        System.out.println(car2.getInfo());

        car2.accelerate(220);
        double timeToGo = car2.go(1000);
        System.out.println("Time to go 1000 km " + timeToGo + " hour.");
        System.out.println(car2.getInfo());

        Car car3 = new Car();

        car3.distance = 200;
        car3.year = "2018";
        car3.make = "Audi";
        car3.model = "Kasko";
        car3.speed = 80;
        car3.go(150);
        System.out.println(car3.getInfo());
        car3.accelerate(100);

        double totalHour = car3.go(1000);
        System.out.println("Time to go 1000 km " + totalHour + " hour");
        System.out.println(car3.getInfo());

        Car car4 = new Car();

        car4.distance = 1_670;
        car4.make = "Toyota";
        car4.model = "RAV4";
        car4.speed = 0;
        car4.year = "2015";
        car4.accelerate(200);
        System.out.println("Time to go 1000 " + car4.go(1000) + " hour");
        System.out.println(car4.getInfo());

    }

}
