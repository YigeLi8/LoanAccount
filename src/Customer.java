import java.lang.reflect.Array;
import java.util.ArrayList;

public class Customer {

    private String firstName;
    private String lastName;
    private String SSN;
    private ArrayList<LoanAccount> loanAccounts;

    public Customer(String firstName, String lastName, String SSN) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = SSN;
        this.loanAccounts = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSSN() {
        return SSN;
    }

    public ArrayList<LoanAccount> getLoanAccounts() {
        return loanAccounts;
    }

    public void addLoanAccount(LoanAccount account) {
        loanAccounts.add(account);
    }

    public String printMonthlyReport() {
        String info = "Account Report for Customer: " + firstName + " " + lastName + " with SSN " + SSN + "\n\n";
        // Iterates through loanAccounts array list
        for (LoanAccount loanAccount : loanAccounts) {
            // Append loanAccount into info
            info += loanAccount.toString();
        }
        return info;
    }
}
