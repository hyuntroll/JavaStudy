package StudyJava.Test.TEST3;

public class Main {
    public static void main(String[] args) {
        ConfigManager configManager = ConfigManager.getInstance();
        Checkout checkout = new Checkout();

        configManager.gameName = "엄준식비뇨기과";
        configManager.gameVersion = "5.2.3";
        configManager.userCount = 1;


        System.out.println("게임 이름: " + configManager.gameName);
        System.out.println("게임 버전: " + configManager.gameVersion);
        System.out.println("유저  수: " + configManager.userCount);

        String character = "warrior";
        Character playerCharacter = CharacterFactory.createCharacter(character);
        System.out.println("캐릭터를 생성합니다: " + character);
        playerCharacter.attack();

        checkout.processPayment(10000000);
        checkout.setPayment(new BitCoin());
        checkout.processPayment(100);
        checkout.setPayment(new PayPalCard());
        checkout.processPayment(102);


    }
}
