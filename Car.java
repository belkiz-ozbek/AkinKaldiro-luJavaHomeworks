package composite;

/**
 *
 * @author belkizozbek
 */
public class Car {

    String model;

    Person owner;

    public String getInfo() {
        String info = owner.tckn + " " + owner.name + " " + owner.surname + " ";

        if (owner != null) {
            return info += model + " modelinin sahibidir.";
        } else {
            return info += " kişisinin arabası yoktur.";
        }
    }

}
