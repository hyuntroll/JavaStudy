package Chapter_06;

public class _Quiz_06 {
    public static String getHiddenData(String data, int type) {

        String transferedData = data.substring(0, type);
        for (int i = transferedData.length(); i < data.length(); i++) {
            transferedData += "*";
        }
        return transferedData;
        }
//        return "a";


    public static void main(String[] args) {
        String Name = "현승민";
        String PhoneNumber = "010-9106-1530";
        String Id = "000000-0000000";

        String result = getHiddenData(Name, 1);
        System.out.println(result);
        result = getHiddenData(Id, 8);
        System.out.println(result);
        result = getHiddenData(PhoneNumber, 9);
        System.out.println(result);
    }

}
