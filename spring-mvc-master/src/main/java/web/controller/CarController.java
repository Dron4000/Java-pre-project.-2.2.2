package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.service.CarService;


import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarService carService;


    @GetMapping
    public String hello(@RequestParam(value = "count", defaultValue = "5", required = false) int cont, Model model) {
        List<Car> list = new ArrayList<>();
        Car car1 = new Car("LADA", "BLACK", 12);
        Car car2 = new Car("BMW", "WHITE", 5);
        Car car3 = new Car("NIVA", "GREEN", 1);
        Car car4 = new Car("VOLVO", "BLACK", 4);
        Car car5 = new Car("NISSAN", "GRAY", 2);
        list.add(car1);
        list.add(car2);
        list.add(car3);
        list.add(car4);
        list.add(car5);
        list = carService.getListCar(list, cont);
        model.addAttribute("list", list);

        return "cars";
    }


}



