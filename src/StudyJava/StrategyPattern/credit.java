package StudyJava.StrategyPattern;

interface PaymentStrategy {
    void pay();
}

class CreditCard implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("신용카드 결제;;");
    }
}

class PayPalCard implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("페이팔로 결제;;");
    }
}

class Checkout {
    private PaymentStrategy strategy;

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void processPayment() {
        if ( strategy == null ) {
            System.out.println("결제 방식이 적용되지 않았습니다;;");
        } else {
            strategy.pay();
        }
    }
}

public class credit {
    public static void main(String[] args) {
        Checkout checkout = new Checkout();
        checkout.processPayment();
        checkout.setStrategy(new CreditCard());
        checkout.processPayment();
        checkout.setStrategy(new PayPalCard());
        checkout.processPayment();
    }
}
