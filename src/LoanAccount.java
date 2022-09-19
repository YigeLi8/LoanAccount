public class LoanAccount {

    private double annualInterestRate;
    private double principal;
    private int months;

    //parameters constructor for the attributes
    public LoanAccount(double principle, double annualInterestRate, int months) {
        this.principal = principle;
        this.annualInterestRate = annualInterestRate;
        this.months = months;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    // Constructors
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getPrincipal() {
        return principal;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    // Monthly Calculation Method
    public double calculateMonthlyPayment() {
        double monthlyInterest = annualInterestRate / 12;
        return principal * (monthlyInterest / (1 - Math.pow(1 + monthlyInterest, -getMonths())));
    }

    @Override
    public String toString() {
        return "\nPrinciple: $" + principal +
                "\nAnnual Interest Rate: " + annualInterestRate +
                "%\nTerm of Loan in Months: " + months +
                "\nMonthly Payment: $" + calculateMonthlyPayment();
    }
}
