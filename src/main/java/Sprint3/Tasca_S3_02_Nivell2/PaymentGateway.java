package Sprint3.Tasca_S3_02_Nivell2;

import Sprint3.Tasca_S3_02_Nivell2.PaymentMethod.PaymentMethod;

public class PaymentGateway {
    public void issuePayment(PaymentMethod paymentMethod, int price) {
        paymentMethod.payment(price);
    }
}