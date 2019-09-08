package Lesson6;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add(0, "ноль");
        a.add(1, "один");
        a.add(2, "два");
        a.add(3, "три");
        printAL(a);

        if (a.contains("три")) {
            a.add("четыре");
        }
        a.remove(2);
        printAL(a);

        if (a.indexOf("четыре") != 4) {
            a.add(4, "4.2");
        }
        printAL(a);

        if (a.contains("два")) {
            a.add("2.2");
            printAL(a);
        }
    }

    static void printAL(ArrayList <String> al) {
        for (String element : al) {
            System.out.print(element + " ");
        }
        System.out.println(" ");
    }
}

    //My comment