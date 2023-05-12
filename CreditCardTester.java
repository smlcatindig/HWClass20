package class20;

public class CreditCardTester {
        public static void main(String[] args) {
            CreditCard creditCard = new CreditCard();
            creditCard.calculateInterest(2000.56, 0.05);

            Visa visa = new Visa();
            visa.calculateInterest(4000.6, 0.02);

            AX ax = new AX();
            ax.calculateInterest(5000.32, 0.01);
        }
    }
