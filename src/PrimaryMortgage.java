public class PrimaryMortgage extends LoanAccount{

    private double PMIMonthlyAmount;
    private Address address;

    // Constructor for the class
    public PrimaryMortgage(double principal, double annualInterestRate, int months, double PMIMonthlyAmount, Address address) {
        super(principal, annualInterestRate, months);
        this.PMIMonthlyAmount = PMIMonthlyAmount;
        this.address = address;
    }

    @Override
    public String toString() {
        return "\n" + "\nPrimary Mortgage Loan with: " +
                super.toString() +
                "\nPMI Monthly Amount: $" + PMIMonthlyAmount +
                address.toString();
    }
}
