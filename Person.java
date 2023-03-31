package composite;

/**
 *
 * @author belkizozbek
 */
public class Person {

    String tckn;
    String name;
    String surname;

    Car vehicle;

    public String getInfo() {
        String info = "Person info: " + tckn + " " + name + " " + surname;
        if (vehicle != null) {
            info += " and has a car: " + vehicle.getInfo();
        } else {
            info += " and has no car.";
        }
        return info;
    }

}
