package Lesson2;

public class Task1 { //Exercise A
    boolean canRecord = false;
    void playTape() {
        System.out.println("tape playing");
    }

    void recordType() {
        System.out.println("tape recording");
    }
}

class TapeDeskTestDrive {
    public static void main(String [] args) {
        Task1 t = new Task1();
        t.canRecord = true;
        t.playTape();

        if (t.canRecord == true) {
            t.recordType();
        }
    }
}

class DVDPlayer {  //Exercise B
    boolean canRecord = false;

    void recordDVD() {
        System.out.println("DVD recording");
    }

    void playDVD () {
        System.out.println("DVD playing");
    }
}
class DVDPlayerTestDrive {
    public static void  main(String [] args) {
        DVDPlayer d = new DVDPlayer();
        d.canRecord = true;
        d.playDVD();

        if (d.canRecord == true) {
            d.recordDVD();
        }
    }
}

