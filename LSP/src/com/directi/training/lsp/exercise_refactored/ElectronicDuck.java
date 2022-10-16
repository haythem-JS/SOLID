package com.directi.training.lsp.exercise_refactored;

public class ElectronicDuck
{
    private boolean _on = false;

    public void quack()
    {
            System.out.println("Electronic duck quack...");
    }

    public void swim()
    {
            System.out.println("Electronic duck swim");
    }

    public void turnOn()
    {
        _on = true;
    }

    public void turnOff()
    {
        _on = false;
    }
}
