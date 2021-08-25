package org.itstep.hw15.db;

import org.itstep.hw15.entity.Car;

import java.util.ArrayList;
import java.util.List;

public class DbManager {

    private static List<Car> cars = new ArrayList();
    private static Long index = 1L;

    public static void addCar(Car car) {
        car.setId(index);
        cars.add(car);
        index++;
    }

    public static List<Car> getCars() {
        return cars;
    }
}
