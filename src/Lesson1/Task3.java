package Lesson1;

public class Task3 {
    public static void main(String [] args) {
        int x = 0;
        int y = 0;
        while (x < 5) {
            y = x - y; //Output: 00 11 21 32 42

            y = y + x; //Output: 00 11 23 36 410

            y = y +2; //Output: 02 14 25 36 47
            if (y > 4) {
                y = y - 1;
            }

            x = x + 1; //Output: 11 34 59
            y = y + x;

            if (y < 5) { //Output: 02 14 36 48
                x = x + 1;
                if (y < 3) {
                    x = x - 1;
                }
            }
            y = y + 2;

            System.out.println(x + "" + y +" ");
            x = x + 1;
        }
    }
}
