package com.directi.training.srp.exercise_refactored;

import java.util.Arrays;
import java.util.List;

public class CarManager
{
    private cars  = new CarDB(Arrays
        .asList(new Car("1", "Golf III", "Volkswagen"), new Car("2", "Multipla", "Fiat"),
            new Car("3", "Megane", "Renault")));

    private carsComparator = new CarComparator(cars);


}

