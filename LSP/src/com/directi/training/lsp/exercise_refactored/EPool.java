package com.directi.training.lsp.exercise_refactored;

public class EPool {
    public void run()
    {
        ElectronicDuck electricDuck = new ElectronicDuck();
        quack(electricDuck);
        swim(electricDuck);
        turnOn(electricDuck);
        turnOff(electricDuck);
    }

    private void quack(ElectronicDuck... ducks)
    {
        for (ElectronicDuck duck : ducks) {
                duck.quack();
        }
    }

    private void swim(ElectronicDuck... ducks)
    {
        for (ElectronicDuck duck : ducks) {
                duck.swim();
        }
    }

    private void turnOn(ElectronicDuck... ducks)
    {
        for (ElectronicDuck duck : ducks) {
            duck.turnOn();
        }
    }

    private void turnOff(ElectronicDuck... ducks)
    {
        for (ElectronicDuck duck : ducks) {
            duck.turnOff();
        }
    }

    public static void main(String[] args)
    {
        EPool pool = new EPool();
        pool.run();
    }
}
