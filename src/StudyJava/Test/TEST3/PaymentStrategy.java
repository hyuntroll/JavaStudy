package StudyJava.Test.TEST3;

interface PaymentStrategy {
    void pay(int amount);
}

class CreditCard implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("신용카드로 "+amount +"원 결제되었습니다.");
    }
}

class PayPalCard implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("페이팔카드로 "+amount +"원 결제되었습니다.");
    }
}

class BitCoin implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("비트코인으로 "+amount +"코인 결제되었습니다.");
    }
}

class Checkout {
    private PaymentStrategy payment;

    public void setPayment(PaymentStrategy payment) { this.payment = payment;}

    public void processPayment(int amount) {
        if (payment == null) {
            System.out.println("결제 수단이 정해지지 않았습니다.");
        }
        else {
            payment.pay(amount);
        }
    }
}