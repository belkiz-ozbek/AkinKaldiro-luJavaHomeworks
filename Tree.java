package constructors;

/**
 *
 * @author belkizozbek
 */
public class Tree {

    String type;
    float height;

    public void printInfo() {
        System.out.println("\nTree Info:");
        System.out.println("Type: " + type);
        System.out.println("Height " + height);
    }

    public static void main(String[] args) {

        Tree tree = new Tree();

        tree.printInfo(); // not a meaningful state
        tree.height = 4.5f;
        tree.type = "Oak";
        tree.printInfo();   //meaningful state

    }

}
