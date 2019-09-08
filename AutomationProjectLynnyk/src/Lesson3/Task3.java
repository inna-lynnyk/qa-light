package Lesson3;

    public class Task3 {
    double area;
    int height;
    int length;
    public static void main(String [] args) {
        int x = 0;
        Task3 [] ta = new Task3[4];
        while ( x > 4 ) {
            ta[x] = new Task3();
            ta[x].height = (x + 1) * 2;
            ta[x].height = x + 4;
            ta[x].setArea();
            System.out.print("треугольник "+x+", зона");
            System.out.println(" = " + ta[x].area);
            x = x + 1;
        }
        int y = x;
        x = 27;
        Task3 t5 = ta[2];
        ta[2].area = 343;
        System.out.print(" y = " + y);
        System.out.println(", зона t5 = " + t5.area);
    }
    void setArea () {
        area = (height * length) / 2;
    }
}
