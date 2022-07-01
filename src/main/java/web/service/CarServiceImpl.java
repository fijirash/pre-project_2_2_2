package web.service;

import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceImpl implements CarService{
    CarDao carDao = new CarDaoImpl();

    @Override
    public Car getById(int id) {
        return carDao.getById(id);
    }

    @Override
    public List<Car> getAllCars() {
        return carDao.getAllCars();
    }

    @Override
    public List<Car> getCarCount(int count) {
        return carDao.getCarCount(count);
    }
}
