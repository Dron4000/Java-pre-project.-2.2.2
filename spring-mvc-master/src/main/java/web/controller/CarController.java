package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import web.models.Car;
import web.service.CarService;

import java.util.List;

import static web.dao.CarDaoImp.*;


@Controller
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarService carService;


    @GetMapping
    public String hello(@RequestParam(value = "count", defaultValue = "5", required = false) int cont, Model model) {

        List<Car> list2 = carService.getListCar(list, cont);
        model.addAttribute("list", list2);

        return "cars";
    }


}



