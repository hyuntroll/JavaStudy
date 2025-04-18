package StudyJava.Test.TEST5;

/*🎯 요구 사항
[1] 싱글톤
HomeConfig 클래스는 시스템 전역 설정을 관리합니다.

필드: ownerName, homeVersion, deviceLimit

싱글톤 패턴으로 구현

[2] 팩토리
다양한 스마트 기기를 만드는 DeviceFactory 클래스를 구현하세요.

"light", "aircon", "tv" 중 입력으로 선택 가능

각 기기는 SmartDevice 라는 추상 클래스를 상속함

추상 메서드 turnOn(), turnOff() 포함

[3] 전략 패턴
각 기기는 에너지 절약 모드 전략을 사용할 수 있어야 함.

EnergyStrategy 인터페이스를 만들고 아래 클래스를 구현하세요:

NormalMode: "기기가 일반 모드로 동작합니다."

EcoMode: "기기가 에코 모드로 동작합니다."

PowerSavingMode: "기기가 전력 절감 모드로 동작합니다."

각 기기는 setEnergyStrategy()로 전략을 교체 가능해야 함

* */




public class Main {
    public static void main(String[] args) {
        HomeConfig config = HomeConfig.getInstance();
        config.setowName("엄준식");
        config.sethomeVr("v2.6");
        HomeConfig.setdeLimit(4);

        String newDevice = "tv";
        SmartDevice tv = DeviceFactory.createNewDevice(newDevice);

//        if (HomeConfig.getdeLimit() < 5)
//        {
//            tv = DeviceFactory.createNewDevice(newDevice);
//        }

        System.out.println("홈 소유자: " + config.getowName());
        System.out.println("버전: " + config.gethomeVr());
        System.out.println("최대 기기 수: " + HomeConfig.getdeLimit());

        System.out.println();

        tv.setEnergyStrategy(new EcoMode());
        tv.turnOn();

        tv.turnOff();

    }
}
