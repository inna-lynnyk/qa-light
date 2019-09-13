package Lesson10;

class StaticSuper {
    static {
        System.out.println("Родительский статический блок");
    }
    StaticSuper() {
        System.out.println("Родительский конструктор");
    }
}
public class Task1 extends StaticSuper {
    static  int rand;
    static {
        rand = (int) (Math.random() * 6);
        System.out.println("Статический блок " + rand);
    }
    Task1 () {
        System.out.println("Конструктор");
    }
    public static void main(String[] args) {
        System.out.println("Внутри main");
        Task1 st = new Task1();
    }
}
