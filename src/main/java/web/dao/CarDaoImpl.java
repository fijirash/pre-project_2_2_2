package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarDaoImpl implements CarDao {
    private final List<Car> carList = new ArrayList<>();

    {
        carList.add(new Car("VAZ", 2015));
        carList.add(new Car("UAZ", 2011));
        carList.add(new Car("KIA", 2021));
        carList.add(new Car("BMW", 2020));
        carList.add(new Car("OKA", 1997));
    }

    @Override
    public Car getById(int id) {
        return carList.stream().filter(car -> car.getId() == id).findAny().orElse(null);
    }

    @Override
    public List<Car> getAllCars() {
        return carList;
    }

    @Override
    public List<Car> getCarCount(int count) {
        if (count < carList.size()) {
            return carList.stream().limit(count).collect(Collectors.toList());
        } else {
            return carList;
        }
    }
}
