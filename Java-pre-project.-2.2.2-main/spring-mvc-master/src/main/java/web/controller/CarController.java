package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;


@Controller
public class CarController {

    @Autowired
    private CarService carService;


    @GetMapping(value = "/cars")
    public String hello(@RequestParam(value = "count", defaultValue = "5", required = false) int cont, Model model) {
        model.addAttribute("list", carService.getCar(cont));
        return "cars";
    }


}



