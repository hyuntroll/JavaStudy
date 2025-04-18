package StudyJava.Test.TEST3;

abstract class Character {
    abstract void attack();
}

class Warrior extends Character {
    @Override
    void attack() {
        System.out.println("Warrior 엄;");
    }
}

class Mage extends Character {
    @Override
    void attack() {
        System.out.println("Mage 준");
    }
}

class Archer extends Character {
    @Override
    void attack() {
        System.out.println("Archer 식");
    }
}

public class CharacterFactory {
    static Character createCharacter(String type) {
        switch (type.toLowerCase()) {
            case "warrior":
                return new Warrior();
            case "mage":
                return new Mage();
            case "archer":
                return new Archer();
            default:
                throw new IllegalArgumentException("뭔가 잘못 입력함 ㅅㄱ");
        }
    }
}
