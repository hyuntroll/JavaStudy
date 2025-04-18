package StudyJava.Test.TEST5;

abstract class SmartDevice {
    EnergyStrategy energyStrategy;

    void setEnergyStrategy(EnergyStrategy energyStrategy) {
        this.energyStrategy = energyStrategy;
    }

    abstract void turnOn();
    abstract void turnOff();
}

class Light extends SmartDevice {
    @Override
    void turnOn() {
        System.out.println("전등이 켜집니다.");
        if (energyStrategy == null) {
            System.out.println("모드 선택이 되지 않았습니다.");
        }
        else {
            energyStrategy.apply();
        }
    }
    @Override
    void turnOff() {
        System.out.println("전등이 꺼집니다.");
    }

}

class Aircon extends SmartDevice {
    @Override
    void turnOn() {
        System.out.println("에어컨 켜집니다.");
        if (energyStrategy == null) {
            System.out.println("모드 선택이 되지 않았습니다.");
        }
        else {
            energyStrategy.apply();
        }
    }
    @Override
    void turnOff() {
        System.out.println("어에컨 꺼집니다.");
    }

}

class Tv extends SmartDevice {
    @Override
    void turnOn() {
        System.out.println("티비가 켜집니다.");
        if (energyStrategy == null) {
            System.out.println("모드 선택이 되지 않았습니다.");
        }
        else {
            energyStrategy.apply();
        }
    }
    @Override
    void turnOff() {
        System.out.println("티비가 꺼집니다.");
    }

}


public class DeviceFactory {
    static SmartDevice createNewDevice(String name) {
        switch (name.toLowerCase()) {
            case "light":
                return new Light();
            case "aircon":
                return new Aircon();
            case "tv":
                return new Tv();
            default:
                throw new IllegalArgumentException("오류가 발생했습니다.");
        }
    }
}
