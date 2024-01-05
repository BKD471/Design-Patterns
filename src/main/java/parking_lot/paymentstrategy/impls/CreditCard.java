package parking_lot.paymentstrategy.impls;

import parking_lot.paymentstrategy.ITender;

public class CreditCard implements ITender {
    /**
     *
     */
    @Override
    public void settlePayment() {
        System.out.println("Your payment has been settled using Credit Card....");
    }
}
