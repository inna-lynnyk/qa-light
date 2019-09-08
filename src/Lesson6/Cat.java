package Lesson6;

public class Cat extends Animal {

    private static int TotalStepsForAllCats = 0;
    private int TotalSteps = 0;
    public String Title;

    public Cat(String title)
    {
        Title = title;
    }

    public static Cat Create(String title)
    {
        return new Cat(title);
    }

    public void MakeNoise()
    {
        System.out.println("Meow!");
    }

    @Override
    public void Move(int steps) {
        super.Move(steps);
        TotalSteps = TotalSteps + steps;
        TotalStepsForAllCats = TotalStepsForAllCats + steps;
        System.out.println("Total distance for " + Title + " is = " + TotalSteps);
    }

    @Override
    protected int GetStepSize()
    {
        int originalStepSize = super.GetStepSize();

        return originalStepSize + 1;
    }

    public static int GetTotalStepsForAllCats()
    {
        return TotalStepsForAllCats;
    }
}
