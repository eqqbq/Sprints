package Sprint3.Tasca_S3_02_Nivell2;

import Sprint3.Tasca_S3_02_Nivell2.PaymentMethod.*;

public class ShoeStore {
    public static void main(String[] args) {

        PaymentGateway payment = new PaymentGateway();

        payment.issuePayment(new Paypal("randomUser"), 123123);
        payment.issuePayment(new CreditCard(654987654), (123123));
        payment.issuePayment(new Account(234556456), 375);

    }
}