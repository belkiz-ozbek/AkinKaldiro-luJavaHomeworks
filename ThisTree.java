package thisDemo;

/**
 *
 * @author belkizozbek
 */
public class ThisTree {

    String type;
    float height;

    public ThisTree(String type, float height) {
        this.type = type;
        this.height = height;
    }

    public void printInfo() {
        System.out.println("\nTree info: ");
        System.out.println("Type: " + type);
        System.out.println("Height: " + height);
    }

    public void printType() {
        System.out.println("Type: " + this.type);   //this'e gerek yok
    }

    public void printHeight() {
        System.out.println("Height: " + this.height);   //this'e gerek yok
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    public static void main(String[] args) {

        ThisTree tree = new ThisTree("Kavak", 1.8f);
        tree.printInfo();
        tree.printHeight();

    }
}
