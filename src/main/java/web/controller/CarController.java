package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;


@Controller
public class CarController {
    private final CarServiceImpl car;

    public CarController(CarServiceImpl car) {
        this.car = car;
    }

    @GetMapping("/cars")
    public String printCarsList(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap model) {
        model.addAttribute("cars", car.getCarCount(count));
        return "cars";
    }


}