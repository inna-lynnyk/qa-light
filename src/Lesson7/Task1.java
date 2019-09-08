package Lesson7;

public class Task1 {
    static int ivar = 7;
    void m1() {
        System.out.print("A's m1, ");
    }
    void m2() {
        System.out.print("A's m2, ");
    }
    static void m3() {
        System.out.print("A's m3, ");
    }
}

class B extends Task1 {
    void m1() {
        System.out.print("B's m1, ");
    }
}

class C extends Task1 {
    static void m3() {
        System.out.print("C's m3, " + (ivar + 6));
    }
}

class Mixed2 {
    public static void main(String [] args) {
        Task1 a = new Task1();
        B b = new B();
        C c = new C();
        Task1 a2 = new C();

        b.m1(); //Output: "B's m1, A's m2, A's m3,"
        c.m2();
        Task1.m3();

/*      c.m1(); //Output: "B's m1, A's m2, A's m3, 13"
        c.m2();
        C.m3();*/

/*      a.m1(); //Output: "A's m1, A's m2, C's m3, 13"
        b.m2();
        C.m3();*/

/*      a2.m1(); //Output: "B's m1, C's m2, A's m3,"
        a2.m2();
        a2.m3();*/
    }
}

