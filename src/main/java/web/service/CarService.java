package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    Car getById(int id);
    List<Car> getAllCars();
    List<Car> getCarCount(int count);
}
