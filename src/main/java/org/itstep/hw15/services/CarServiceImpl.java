package org.itstep.hw15.services;

import org.itstep.hw15.entity.Car;
import org.itstep.hw15.repo.CarRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CarServiceImpl implements CarService{

    private final CarRepository repository;

    public CarServiceImpl(CarRepository repository) {
        this.repository = repository;
    }

    @Override
    public Car addCar(Car car) {
        return repository.save(car);
    }

    @Override
    public List<Car> getAllCars() {
        return repository.findAll();
    }
}
