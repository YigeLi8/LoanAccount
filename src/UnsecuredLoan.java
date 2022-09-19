public class UnsecuredLoan extends LoanAccount{

    public UnsecuredLoan(double principal, double annualInterestRate, int months) {
        super(principal, annualInterestRate, months);
    }

    @Override
    public String toString() {
        return "\nUnsecured Loan with:" +
                "\nPrinciple: $" + super.getPrincipal() +
                "\nAnnual Interest Rate: " + super.getAnnualInterestRate() +
                "%\nTerm of Loan in Months: " + super.getMonths() +
                "\nMonthly Payment: $" + calculateMonthlyPayment();
    }
}
