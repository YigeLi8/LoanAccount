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
        return "\nPrimary Mortgage Loan with: " +
                "\nPrinciple: $" + super.getPrincipal() +
                "\nAnnual Interest Rate: " + super.getAnnualInterestRate() +
                "%\nTerm of Loan in Months: " + super.getMonths() +
                "\nPMI Monthly Amount: $" + PMIMonthlyAmount +
                "\nMonthly Payment: $" + calculateMonthlyPayment() +
                address.toString();
    }
}
