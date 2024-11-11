package calculateinterest;

public class CalculatorInterest {

    public static final double IGV_RATE = 0.18; //18%
    public static void main(String[] args) {
        // Define the loan amount and interest rates and  IGV
        double loan = 35500;
        double interestRate = 25.5 / 100; // 25.5%
        //double interestRate = 0.255  // 25%
        //double rateIGV = 18.0 / 100; // 18%
        //double rateIGV = 0.18  // 18%

        // Calculate interest
        double interest = loan * interestRate;

        // Calculate IGV on interest
        double igv = interest * IGV_RATE;

        // Show the result
        System.out.println("Amount loan: " + loan);
        System.out.println("Interest calculated (25.5%): " + interest);
        System.out.println("IGV calculated on interest (18%): " + igv);
    }
}
