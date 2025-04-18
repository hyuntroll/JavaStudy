package StudyJava.Test.TEST5;

public interface EnergyStrategy {
    void apply();
}

class NormalMode implements EnergyStrategy {
    @Override
    public void apply() {
        System.out.println("기기가 일반 모드로 동작합니다.");
    }
}

class EcoMode implements EnergyStrategy {
    @Override
    public void apply() {
        System.out.println("기기가 에코 모드로 동작합니다.");
    }
}

class PowerSavingMode implements EnergyStrategy {
    @Override
    public void apply() {
        System.out.println("기기가 절력 절감 모드로 동작합니다.");
    }
}