package org.itstep.hw15.services;

import org.itstep.hw15.entity.Car;

import java.util.List;

public interface CarService {

    Car addCar(Car car);

    List<Car> getAllCars();
}
