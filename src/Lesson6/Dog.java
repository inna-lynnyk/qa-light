package Lesson6;

public class Dog extends Animal {

    public void MakeNoise() {
        System.out.println("Gav!");
    }

    @Override
    protected int GetStepSize() {
        return 2 + super.GetStepSize();
    }
}
