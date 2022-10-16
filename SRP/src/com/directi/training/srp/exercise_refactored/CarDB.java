package com.directi.training.srp.exercise_refactored;

import java.util.Arrays;
import java.util.List;

public class CarDB
{
    private List<Car> _carsDb ;

    public CarDB(List<Car> carsDb)
    {
        _carsDb = carsDb;  
    }

    public Car getFromDb(final String carId)
    {
        for (Car car : _carsDb) {
            if (car.getId().equals(carId)) {
                return car;
            }
        }
        return null;
    }

    public String getCarsNames()
    {
        StringBuilder sb = new StringBuilder();
        for (Car car : _carsDb) {
            sb.append(car.getBrand());
            sb.append(" ");
            sb.append(car.getModel());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }

}
