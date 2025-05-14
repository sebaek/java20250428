package ch09.sec07.exam02;

public class Home {
    private RemoteControl rc = new RemoteControl() {
        @Override
        public void turnOn() {
            System.out.println("turn tv on");
        }

        @Override
        public void turnOff() {
            System.out.println("turn tv off");
        }
    };

    public void use1() {
        rc.turnOn();
        rc.turnOff();
    }

    public void use2() {
        RemoteControl rc = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("aircon on");
            }

            @Override
            public void turnOff() {
                System.out.println("aircon off");
            }
        };
        rc.turnOn();
        rc.turnOff();
    }

    public void use3(RemoteControl rc) {
        rc.turnOn();
        rc.turnOff();
    }
}
