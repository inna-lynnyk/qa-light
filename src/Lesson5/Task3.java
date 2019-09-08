package Lesson5;

public class Task3 {
    public static void main(String [] args) {
        int x = 0;
        int y = 30;
        for (int outer = 0; outer < 3; outer++) {
            for (int inner = 4; inner > 1; inner--) {
                x = x + 3; // Output: 54 6
                // x = x + 6; // Output: 60 10
                //x = x + 2; // Output: 45 6
                // x++; // Output: 36 6
                // x--; // Output: 18 6
                // x = x + 0; // Output: 6 14
                y = y -2;
                if (x == 6) {
                    break;
                }
                x = x + 3;
            }
            y = y - 2;
        }
        System.out.println(x + " " + y);
    }
}
