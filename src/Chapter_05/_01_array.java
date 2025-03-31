package Chapter_05;


public class _01_array {
    public static void main(String[] args) {
        // 같은 자료형의 값 여러개를 저장하는 '연속된 공간'

        // 배열 선언 첫 번째
        String[] coffees = new String[4]; // 4크기의 스트링 배열

        // 두 번째
//            String coffees[] = new String[4];

        coffees[0] = "엄"; // 0부터 index 시작
        coffees[1] = "준";
        coffees[2] = "식";
        coffees[3] = "비";
//        coffees[4] = "비"; 배열 범위를 벗어남

        // 세 번째
        // 이때는 숫자를 적지 않음
        String[] Coffees = new String[] {"엄", "준", "식", "비"};

        // 네 번 째
        String[] cof = {"엄", "준", "식", "비"};

        System.out.println(cof[0] + "하나");


        boolean[] b = {true, false, true};
    }




}
