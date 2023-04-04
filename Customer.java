package bankTest;

/**
 *
 * @author belkizozbek
 */
public class Customer {
    int id;
    String name;
    CreditCard cc;
    
    public Customer(int id, String name){
        this.id = id;
        this.name = name;
    }
    
    public void setCreditCard(CreditCard cc){
        this.cc = cc;
    }
    
}
