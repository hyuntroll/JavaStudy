package StudyJava.Test.TEST4;

public class Main {
    public static void main(String[] args) {
        GameSettings gameSettings = GameSettings.getInstance();
        gameSettings.settGameName("엄준식;");
        gameSettings.setMaxPlayers(3);
        gameSettings.setVersion("1.0.0");

        System.out.println(gameSettings.getGameName());
        System.out.println(gameSettings.getVersion());
        System.out.println(gameSettings.getMaxPlayers());

        Monster dragon = MonsterFactory.createMonster("dragon");
        dragon.setStrategy(new CriticalAttack());
        dragon.attack(12345);
        dragon.setStrategy(new NormalAttack());
        dragon.attack(254);


    }
}
