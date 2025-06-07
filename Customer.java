import java.util.*;
class Customer extends Person{

private String customer_number;
private boolean isInMail;

public Customer(String name, String address, String phoneNumber,String customer_number, boolean isInMail){
	super(name, address, phoneNumber);
	this.customer_number= customer_number;
	this.isInMail= isInMail;
}
public String getCustomer_number(){
return customer_number;
}

public void setCustomer_number(String customer_number){
this.customer_number= customer_number;
}

public boolean getisInMail(){
return isInMail;
}

public void setisInMail(boolean isInMail){
this.isInMail= isInMail;
}

public static void main( String [] args){
    Scanner in = new Scanner(System.in);

    System.out.print("Enter name: ");
    String name = in.nextLine();

    System.out.print("Enter address: ");
    String address = in.nextLine();

    System.out.print("Enter phone number: ");
    String phoneNumber = in.nextLine();

    System.out.print("Enter customer number: ");
    String customer_number = in.nextLine();

    System.out.print("Would you like to be on the mailing list? (yes/no): ");
    String mailInput = in.nextLine();
    boolean isInMail = mailInput.equalsIgnoreCase("yes");

    // Create a new Customer object with user input
    Customer customer = new Customer(name, address, phoneNumber, customer_number, isInMail);
    System.out.println("Customer Info: "+"\n\n\t Name: " +customer.getName()
    + "\n\t Address: "+customer.getAddress()
    +"\n\t Phone Number: "+customer.getphoneNumber()
    +"\n\t Customer Number: "+customer.getCustomer_number()
    + "\n\t Would you like to be on the mailing list: "+(customer.getisInMail() ? "Yes" : "No") );

    in.close();
}

}
/*CLASS Customer EXTENDS Person
    PRIVATE STRING customer_number
    PRIVATE BOOLEAN isInMail

    METHOD Customer(name, address, phoneNumber, customer_number, isInMail)
        CALL SUPER(name, address, phoneNumber)
        SET this.customer_number TO customer_number
        SET this.isInMail TO isInMail
    END METHOD

    METHOD getCustomer_number()
        RETURN customer_number
    END METHOD

    METHOD setCustomer_number(customer_number)
        SET this.customer_number TO customer_number
    END METHOD

    METHOD getisInMail()
        RETURN isInMail
    END METHOD

    METHOD setisInMail(isInMail)
        SET this.isInMail TO isInMail
    END METHOD

    METHOD main()
        CREATE customer AS NEW Customer("Thomas", "130 Mountain Ave.", "123-456-7890", "12554", FALSE)

        PRINT "Customer Info:"
        PRINT "   Name: " + CALL customer.getName()
        PRINT "   Address: " + CALL customer.getAddress()
        PRINT "   Phone Number: " + CALL customer.getphoneNumber()
        PRINT "   Customer Number: " + CALL customer.getCustomer_number()
        PRINT "   Would you like to be on the mailing list: " + (IF CALL customer.getisInMail() THEN "Yes" ELSE "No")
    END METHOD
END CLASS
*/
