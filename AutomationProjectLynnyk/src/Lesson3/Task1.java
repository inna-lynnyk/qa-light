package Lesson3;

import org.w3c.dom.ls.LSOutput;

public class Task1 {  //Exercise 1
    String title;
    String author;
}

class BookTestDrive {
    public static void main(String [] args) {
        Task1 [] myBooks = new Task1[3];
        int x = 0;
        myBooks[0] = new Task1();
        myBooks[1] = new Task1();
        myBooks[2] = new Task1();
        myBooks[0].title = "The Grapes of Java";
        myBooks[1].title = "The Java Gatsby";
        myBooks[2].title = "The Java Cookbook";
        myBooks[0].author = "bob";
        myBooks[1].author = "sue";
        myBooks[2].author = "ian";

        while (x < 3) {
            System.out.println(myBooks[x].title);
            System.out.println("by");
            System.out.println(myBooks[x].author);
            x = x +1;
        }
    }
}

class Hobbits {  //Exercise 2
    String name;
    public static void main(String [] args) {
        Hobbits [] h = new Hobbits[3];
        int z = -1;

        while (z < 2) {
            z = z + 1;
            h[z] = new Hobbits();
            h[z].name = "Бильбао";
            if (z == 2) {
                h[z].name = "Cэм";
            }
            System.out.println(h[z].name + " - ");
            System.out.println("имя хорошего хоббита");
        }
    }
}

