package Lesson9;

class Bees {
    Task2 [] beeHA;
}
class Raccoon {
    Kit k;
    Task2 rh;
}
class Kit {
    Task2 kh;
}
class Bear {
    Task2 hunny;
}
public class Task2 { //Most popular Object
    public static void main(String [] args) {
        Task2 honeyPot = new Task2(); //Most popular variable
        Task2 [] ha = {honeyPot, honeyPot, honeyPot, honeyPot,};
        Bees b1 = new Bees();
        b1.beeHA = ha;
        Bear [] ba = new Bear[5];
        for (int x = 0; x < 5; x++) {
            ba[x] = new Bear();
            ba[x].hunny = honeyPot;
        }
        Kit k = new Kit();
        k.kh = honeyPot;
        Raccoon r = new Raccoon();
        r.rh = honeyPot;
        r.k = k;
        k = null;
    }
}
