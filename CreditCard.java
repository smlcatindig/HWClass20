package class20;

public class CreditCard {
    /* Create a class CreditCard and define variable balance and interest.
    Create an instance method that will calculate interest based on the given balance.
    Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    Call the method by creating an object of each of the three classes.
     */

    double balance;
    double interest;

        void calculateInterest(double balance, double interest) {
        System.out.println("interest rate: " +balance*interest*.02);
    }
}

    class Visa extends CreditCard {

    }
    class AX extends CreditCard {

       void calculateInterest(double balance, double interest) {
            System.out.println("interest rate: " + balance*interest*.01);
        }
    }
