package bankTest;

/**
 *
 * @author belkizozbek
 */
public class CreditCard {

    String no;
    double balance;
    Customer owner;

    public CreditCard(String no, double balance) {
        this.balance = balance;
        this.no = no;

    }

    public CreditCard(String no, double balance, Customer owner) {
        this(no, balance);
        this.owner = owner;
        owner.setCreditCard(this);
    }

    public void setOwner(Customer owner) {
        this.owner = owner;
    }

}
