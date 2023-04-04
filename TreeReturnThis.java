package thisDemo;

/**
 *
 * @author belkizozbek
 */
public class TreeReturnThis {

    String type;
    Float height;

    public TreeReturnThis(String type, float height) {
        this.type = type;
        this.height = height;
    }

    public TreeReturnThis copy() {
        TreeReturnThis copyTree = new TreeReturnThis(type, height);
        return copyTree;
    }

    public TreeReturnThis grow() {
        height++;
        return this;
    }

    public void printInfo() {
        System.out.println("\nTree info: ");
        System.out.println("Type: " + type);
        System.out.println("Height: " + height);
    }

    public static void main(String[] args) {

    }

}
