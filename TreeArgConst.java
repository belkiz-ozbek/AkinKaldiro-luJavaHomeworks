package constructors;

/**
 *
 * @author belkizozbek
 */
public class TreeArgConst {

    float height;
    String type;

    TreeArgConst(String newType, float newHeight) {
        type = newType;
        height = newHeight;
    }

    public void printInfo() {
        System.out.println("\nInfo of tree: ");
        System.out.println("Type: " + type);
        System.out.println("Height: " + height);
    }

    public static void main(String[] args) {

        TreeArgConst tree1 = new TreeArgConst("Oak", 4.3f);
        TreeArgConst tree2 = new TreeArgConst("Çam", 2.9f);

        tree1.printInfo();
        tree2.printInfo();
        
    }
}
