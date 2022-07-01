package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDao {
    Car getById(int id);
    List<Car> getAllCars();
    List<Car> getCarCount(int count);
}
