package Lesson4;

public class Task2 {
int counter = 0;
public static void main(String [] args) {
    int count = 0;
    Task2 [] m4a = new Task2 [20];
    int x = 0;
    while (x < 9) { //Output: 14 1
    //while (x < 20) { //Output: 25 1
    //while (x < 7) { //Output: 14 1
    //while (x < 19) { //Output: 20 1

        m4a[x] = new Task2();
        m4a[x].counter = m4a[x].maybeNew(x);
        x = x + 1;
    }
    System.out.println(count + " " + m4a[1].counter);
}
public int maybeNew (int index) {
    if (index < 5) {
    //if (index < 5) {
    // if (index < 7) {
    // if (index < 1) {
        Task2 m4 = new Task2();
        m4.counter = m4.counter + 1;
        return 1;
    }
    return 0;
}
}
