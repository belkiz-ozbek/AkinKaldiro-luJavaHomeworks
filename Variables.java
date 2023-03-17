package variables;

public class Variables {

    public static void main(String[] args) {
        
        String str;
        double d;
        int i;
        boolean b;
        
        str = "Belkiz";
        i = 5;
        d = 5.6;
        b = true;
        
        {
            float f = 0.23f;
        }
        
        // System.out.println("float: " + f); //error verir.
        
        System.out.println("str: " + str + " int: " + i + " double: "
               + d + " boolean: " + b);
        
    }
    
}
