package ch09.exercise.p06;

public class Anonymous {
    Vehicle field = new Vehicle() {
        @Override
        public void run() {
            System.out.println("자전거가 달립니다.");
        }
    };

    void method1() {
        Vehicle v = new Vehicle() {
            @Override
            public void run() {
                System.out.println("승용차가 달립니다.");
            }
        };
        v.run();
    }

    void method2(Vehicle vehicle) {
        vehicle.run();
    }
}
