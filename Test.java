package composite;

/**
 *
 * @author belkizozbek
 */
public class Test {

    public static void main(String[] args) {

        Person person = new Person();
        Car car = new Car();
        car.model = "BMW";

        person.name = "Belkiz";
        person.surname = "Ozbek";
        person.tckn = "4584";

        car.owner = person;
        person.vehicle = car;

        System.out.println(person.getInfo());
        System.out.println();
        System.out.println(car.getInfo());
    }

}
