package statik;

/**
 *
 * @author belkizozbek
 */
public class Citizen {

    String tckn;
    String lastName;
    String firstName;

    static String nationality;

    public void printInfo() {
        System.out.println("tckn: " + tckn);
        System.out.println("firstName: " + firstName);
        System.out.println("lastName: " + lastName);
        System.out.println("nationality: " + nationality);
        System.out.println();
    }

    //statik metotlar sadece statik değişkenlere doğrudan ulaşabilirler.
    static String getNationality() {
        return nationality;
    }

}
