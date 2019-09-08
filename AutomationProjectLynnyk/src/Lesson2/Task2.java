package Lesson2;

public class Task2 {
    boolean topHat = true;
    boolean snare = true;

    void playTopHat () {
        System.out.println("ding ding da-ding");
    }

    void playShare() {
        System.out.println("bang bang ba-bang");
    }
}

class DrumKitTestDrive {
    public static void main(String [] args) {
        Task2 d = new Task2();
        d.playShare();
        d.snare = false;
        d.playTopHat();

        if (d.snare == true) {
            d.playShare();
        }
    }
}
