package constructors;

//"this" çağrısı yalnızca constructor'larda yapılır.
//NO REPEAT
/**
 *
 * @author belkizozbek
 */
public class TreeThisConst {

    double height;
    String type;

    public TreeThisConst(double newHeight, String newType) {
        height = newHeight;
        type = newType;
    }

    TreeThisConst(double newHeight) {              //height kendin belirle, type belirli
        // TreeThisConst(height, "Oak");        //aslında bunu yapıyoruz, ama bu şekilde compile hatası veriyor. O yüzden "this" yapısını kullanıyoruz.
        this(newHeight, "Oak");
    }

    TreeThisConst(String newType) {                //Type kendin belirle, height belirli
        this(2.3, newType);
    }

    TreeThisConst() {                           //Hem type hem de height belirle
        this(3.4, "Pine");
    }

    public void printInfo(){
        System.out.println("\nTree Info:");
        System.out.println("Height: " + height);
        System.out.println("Type: " + type);
    }
    
    public static void main(String[] args) {

        TreeThisConst tree1 = new TreeThisConst();
        TreeThisConst tree2 = new TreeThisConst(3.2);
        TreeThisConst tree3 = new TreeThisConst("Çam");
        
        tree1.printInfo();
        tree2.printInfo();
        tree3.printInfo();
        
    }

}
