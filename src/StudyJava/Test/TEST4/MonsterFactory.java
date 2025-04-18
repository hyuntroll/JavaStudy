package StudyJava.Test.TEST4;

abstract class Monster {
    protected AttackStrategy attackStrategy;

    void setStrategy(AttackStrategy strategy) { attackStrategy = strategy;}

    abstract void attack(int power);
}

class Slime extends Monster {

    @Override
    void attack(int power) {
        if (attackStrategy == null ) {
            System.out.println("공격 전략이 설정되지 않았습니다.");
        }
        else{
            attackStrategy.attack(power);
        }
    }
}

class Orc extends Monster {

    @Override
    void attack(int power) {
        if (attackStrategy == null ) {
            System.out.println("공격 전략이 설정되지 않았습니다.");
        }
        else{
            attackStrategy.attack(power);
        }
    }
}

class Dragon extends Monster {

    @Override
    void attack(int power) {
        if (attackStrategy == null ) {
            System.out.println("공격 전략이 설정되지 않았습니다.");
        }
        else{
            attackStrategy.attack(power);
        }
    }
}


public class MonsterFactory {

    static Monster createMonster(String name) {
        switch (name.toLowerCase()) {
            case "slime":
                return new Slime();
            case "orc":
                return new Orc();
            case "dragon":
                return new Dragon();
            default:
                throw new IllegalArgumentException("입력이 잘못되었습니다.");
        }
    }

}
