package Lesson6;

public abstract class Animal {

    public abstract void MakeNoise();

    public void Move(int steps)
    {
        int stepSize = GetStepSize();
        int distance = stepSize * steps;
        //System.out.println("Moved by " + distance);
    }

    protected int GetStepSize()
    {
        return 10;
    }
}
