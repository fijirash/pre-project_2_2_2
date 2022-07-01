import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        CarService cars = new CarServiceImpl();
        System.out.println(cars.getById(3));
    }
}
