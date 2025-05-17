package TodayStudy.DI;

// DI 의존성 주입
/* 외부에서 두 객체 간의 관계를 결정해주는 디자인 패턴
* 인터페이스를 사이에 둬서 클래스 레벨에서 의존관계가 고정되지 않도록
* 런타입 시에 관계를 동적으로 주입 -> 유연성 확보, 결합력 내려감
*
* ex)
* Shop class에서 pencil이라는 클래스를 팔기위해서
* pencil 을 만들면 클래스 끼리 의존관계가 커짐
*
* */

class Pencil {

}

class Store {

    private Pencil pencil;

    public Store() {
        this.pencil = new Pencil(); // 이런 경우 두 클래스가 강하게 결합, 클래스 간의 관계가 맺어짐
    }
}

interface Product {

}

class Pen implements Product {

}

class Shop {

    private Product product;
    public Shop(Product product) {
        this.product = product;
        // 외부에서 상품을 주입(injection)받아서 클래스 두개가 강하게 결합된 걸 막음
        // Store에서 다른 클래스에 의존하지 않음
    }

}


public class DI {
    public static void main(String[] args) {

    }
}
