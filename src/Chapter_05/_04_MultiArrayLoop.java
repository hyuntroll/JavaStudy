package Chapter_05;

public class _04_MultiArrayLoop {
    public static void main(String[] args) {

        String[][] seats = new String[][] {
                {"A1", "A2", "A3", "A4"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4"},
                {"D1", "D2", "D3", "D4"}
        };

        for (int i = 0; i < 4; i++) { // 세로
            for (int j = 0; j < 4; j++) { // 가로
                System.out.print(seats[i][j]+" ");

            }
            System.out.println();

        }

        String[][] seats2 = {
                {"A1", "A2", "A3", "A4"},
                {"B1", "B2", "B3"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        for (int i = 0; i < seats2.length; i++) {
            for (int j = 0; j < seats2[i].length; j++) {
                System.out.print(seats2[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("-----------");
        String[][] seats3 = new String[10][15];
        String[] eng = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};

        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                seats3[i][j] = eng[i] + (j+1);
            }
        }

        seats3[4][8] = "__";
        seats3[5][3] = "__";

        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                System.out.print(seats3[i][j]+" ");
            }
            System.out.println();
        }
    }
}
