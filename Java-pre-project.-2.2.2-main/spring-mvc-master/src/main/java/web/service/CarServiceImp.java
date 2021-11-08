package web.service;


import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImp implements CarService {

    List<Car> list = new ArrayList<>();

    {
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
    }


    @Override
    public List<Car> getCar(int count) {
        List<Car> newlistCar = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            if (count > 5) return list;
            newlistCar.add(list.get(i));

        }
        return newlistCar;
    }


}
