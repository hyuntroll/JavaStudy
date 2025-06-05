package TodayStudy.Enum;
//
//class Fruit {
//
//}

// 열거형 , 서로 연관된 상수들의 집합
enum Fruit {
    APPLE, PEACH, BANANA;
}

public class Enuma {
    public static void main(String[] args) {
        // enum class로 상수를 불러올 땐
        Fruit type = Fruit.APPLE;
        System.out.println();
        switch (type) {
            case APPLE:
                System.out.println("new Thing");
                break;
            default:
                break;
        }
    }
}
