package StudyJava.Test.TEST4;

public interface AttackStrategy {
    void attack(int power);
}

class NormalAttack implements AttackStrategy {
    @Override
    public void attack(int power) {
        System.out.println("일반 공격! 피해: " + power);
    }
}

class CriticalAttack implements AttackStrategy {
    @Override
    public void attack(int power) {
        System.out.println("크리티컬! 피해: " + power * 2);
    }
}

class MagicAttack implements AttackStrategy {
    @Override
    public void attack(int power) {
        System.out.println("마법 공격! 피해: " + power * 3);
    }
}

