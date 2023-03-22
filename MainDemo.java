package Arrays;

/**
 *
 * @author belkizozbek
 */
public class MainDemo {
    public static void main(String[] args) {
        
        if(args.length == 3){
            String name = args[0];
            String surname = args[1];
            String no = args[2];
        }else{
            System.out.println("Please provide three arguments");
            System.exit(1);
        }
        
        for(String str: args){
            System.out.println(str);
        }
        
    }
}
