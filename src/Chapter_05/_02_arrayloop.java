package Chapter_05;

public class _02_arrayloop {
    public static void main(String[] args) {
        // 배열의 순회
        String[] coffees = {"나는", "네가", "빛나는"};
        for (int i = 0; i < coffees.length; i++) {
//        for (int i = 0; i < 3; i++) {
            System.out.println(coffees[i]);
        }
        System.out.println("야미");

        // enhanced for (for-each) 반복문
        // coffees라는 배열에서 값을 받아서 coffee라는 변수로 받음
        for (String coffee : coffees)
        {
            System.out.println(coffee);
        }








    }
}
