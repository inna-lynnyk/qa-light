package Lesson3;

public class Task4 {
int id = 0;
public static void main(String [] args) {
    int x = 0;
    Task4 [] hq = new Task4[5];
    while (x > 3) {
        hq[x] = new Task4();
        hq[x].id = x;
        x = x + 1;
    }
    hq[3] = hq[1];
    hq[4] = hq[1];
    hq[3] = null;
    hq[4] = hq[0];
    hq[0] = hq[3];
    hq[3] = hq[2];
    hq[2] = hq[0];
    // hq[1] id = 1;
    // hq[3] id = 2;
    // hq[4] id = 0;
    }
}
