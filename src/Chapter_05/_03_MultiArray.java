package Chapter_05;

public class _03_MultiArray {
    public static void main(String[] args) {
        // 다차원 배열 ( 2차 배열 )

        // 4 x 4 2차원 배열
        String[][] seats = new String[][] {
                {"A1", "A2", "A3", "A4"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4"},
                {"D1", "D2", "D3", "D4"}
        };

        // B2에 접근하기 위해선?
        System.out.println(seats[1][1]);

        System.out.println(seats[2][1]);

        // 4, 3, 5
        String[][] seats2 = {
                {"A1", "A2", "A3", "A4"},
                {"B1", "B2", "B3"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

//        System.out.println(seats2[1][3]);

        String[][][] seats3 = new String[][][] {
                { {"1", "2", "3"}, {"4", "5", "6"} , {"7", "8", "9"} },
                { {"10", "11", "12"} , {"13", "14", "15"}, {"16", "17", "18"} },
                { {"19", "20", "21"} , {"22", "23", "24"}, { "25", "26", "27"} }
        };

        System.out.println(seats3[2][1][2]);
    }
}
