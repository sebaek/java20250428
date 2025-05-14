package ch08.sec06;

public interface RemoteControl {
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 10;

    void turnOn();

    void turnOff();

    void setVolume(int volume);

    public default void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음 처리");
            setVolume(MIN_VOLUME);
        } else {
            System.out.println("무음 해제");
        }
    }

    public static void changeBattery() {
        System.out.println("건전지 교체");
    }
}
