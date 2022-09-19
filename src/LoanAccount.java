public class LoanAccount {

    private double annualInterestRate;
    private double principal;
    private int months;

    //Constructor for the attributes
    public LoanAccount(double principle, double annualInterestRate, int months) {
        this.principal = principle;
        this.annualInterestRate = annualInterestRate;
        this.months = months;
    }

    // Setter & Getters
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

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
        double monthlyInterest = (annualInterestRate/100) / 12;
        return principal * (monthlyInterest / (1 - Math.pow(1 + monthlyInterest, -months)));
    }

    @Override
    public String toString() {
        return "\nPrinciple: $" + String.format("%.2f", principal) +
                "\nAnnual Interest Rate: " + String.format("%.2f", annualInterestRate) + "%" +
                "\nTerm of Loan in Months: " + months +
                "\nMonthly Payment: $" + String.format("%.2f", calculateMonthlyPayment());
    }
}
