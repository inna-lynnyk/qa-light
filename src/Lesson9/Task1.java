package Lesson9;

import javafx.concurrent.Task;

public class Task1 {
    public static Task1 doStaff() {
        Task1 newGC = new Task1();
        doStaff2(newGC);
        return newGC;
    }
    public static void main(String [] args) {
        Task1 gc1;
        Task1 gc2 = new Task1();
        Task1 gc3 = new Task1();
        Task1 gc4 = gc3;
        Task1 gcl = doStaff();

        gcl = null; //Answer
        gc2 = null;
    }
    public static void doStaff2(Task1 copyTask1) {
        Task1 localGC;
    }
}
