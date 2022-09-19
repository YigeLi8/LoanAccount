public class UnsecuredLoan extends LoanAccount{

    public UnsecuredLoan(double principal, double annualInterestRate, int months) {
        super(principal, annualInterestRate, months);
    }

    @Override
    public String toString() {
        return "\n" + "\nUnsecured Loan with:" +
                super.toString();
    }
}
