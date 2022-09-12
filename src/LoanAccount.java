public class LoanAccount {

    private static double annualInterestRate ;

    private double principal;

    // Constructor
    public LoanAccount(double principal) {
        this.principal = principal;
    }

    // Setter Method
    public static void setAnnualInterestRate(double annualInterestRate) {
        LoanAccount.annualInterestRate = annualInterestRate;
    }

    // Monthly Calculation Method
    public double calculateMonthlyPayment(int numberOfPayments) {
        double monthlyInterest = annualInterestRate / 12;
        double monthlyPayment = principal * ( monthlyInterest / (1 - Math.pow(1 + monthlyInterest, -numberOfPayments)));
        return monthlyPayment;
    }

    // Test Method
    public static void main(String[] args) {
        // Initialize objects
        LoanAccount loan1 = new LoanAccount(5000);
        LoanAccount loan2 = new LoanAccount(31000);

        // Set APR
        LoanAccount.setAnnualInterestRate(0.01);

        // Header
        System.out.println("Monthly payments for loan1 $5000.00 " +
                "and loan2 $31000.00 for 3, 5 and 6 years loans at 1% interest.");
        System.out.println("Loan\t3 years\t5 years\t6 years");

        // Calculate method
        System.out.printf("Loan1\t%.2f\t%.2f\t%.2f", loan1.calculateMonthlyPayment(36),
                loan1.calculateMonthlyPayment(60),
                loan1.calculateMonthlyPayment(72));

        // Calculate method
        System.out.printf("\nLoan2\t%.2f\t%.2f\t%.2f", loan2.calculateMonthlyPayment(36),
                loan2.calculateMonthlyPayment(60),
                loan2.calculateMonthlyPayment(72));

        // Set APR
        LoanAccount.setAnnualInterestRate(0.05);

        // Header
        System.out.println("\n\nMonthly payments for loan1 $5000.00 " +
                "and loan2 $31000.00 for 3, 5 and 6 years loans at 5% interest.");
        System.out.println("Loan\t3 years\t5 years\t6 years");

        // Calculate method
        System.out.printf("Loan1\t%.2f\t%.2f\t%.2f", loan1.calculateMonthlyPayment(36),
                loan1.calculateMonthlyPayment(60),
                loan1.calculateMonthlyPayment(72));

        // Calculate method
        System.out.printf("\nLoan2\t%.2f\t%.2f\t%.2f", loan2.calculateMonthlyPayment(36),
                loan2.calculateMonthlyPayment(60),
                loan2.calculateMonthlyPayment(72));

    }
}
