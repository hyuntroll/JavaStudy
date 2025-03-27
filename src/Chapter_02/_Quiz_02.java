package Chapter_02;

public class _Quiz_02 {

    public static void main(String[] args) {

//        int junior = 115;
        int junior = 121;

        int standard = 120; // standard 가 기준이라는 뜻

        String result = junior >= 120 ? "가능" : "불가능";
//        boolean result = junior >= 120

        System.out.println("키가 "+junior+"cm 이므로 탑승 "+result+"합니다");
    }
}
