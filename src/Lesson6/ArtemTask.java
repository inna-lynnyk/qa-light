package Lesson6;

public class ArtemTask {
    public static void main(String[] args) {

        Cat cat1 = Cat.Create("Murka");
        Cat cat2 = new Cat("Kuzya");
        Cat cat3 = new Cat("Barsik");

        cat1.Move(5);
        cat2.Move(6);
        cat3.Move(7);
        System.out.println("");
        cat1.Move(8);
        cat2.Move(9);
        cat3.Move(10);
        System.out.println("");
        System.out.println("Total for all cats = " + Cat.GetTotalStepsForAllCats());
    }
}
