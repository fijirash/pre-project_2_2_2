import web.service.CarService;
import web.service.CarServiceImpl;


public class Test {
    public static void main(String[] args) {
        CarService car = new CarServiceImpl();
        System.out.println(car.getAllCars());
        
    }
}
