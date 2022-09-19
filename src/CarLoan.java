public class CarLoan extends LoanAccount{

    private String vehicleVIN;

    public CarLoan(double principle, double annualInterestRate, int months, String vehicleVIN) {
        super(principle, annualInterestRate, months);
        this.vehicleVIN = vehicleVIN;
    }

    @Override
    public String toString() {
        return "Car Loan with: " +
                "\nPrincipal: " + super.getPrincipal() +
                "\nAnnual Interest Rate: " + super.getAnnualInterestRate() +
                "\nTerm of Loan in Months: " + super.getMonths() +
                "\nMonthly Payment: $" + calculateMonthlyPayment() +
                "\nVehicle VIN: " + vehicleVIN;
    }
}
