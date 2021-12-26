package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImp implements CarDao {

  public  static   List<Car> list = new ArrayList<>();


    static {

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

    public CarDaoImp() {
    }


    @Override
    public List<Car> getListCar(List<Car> list, int count) {
        if (count >= 5 || count <= 0) return list;
        return list.stream().limit(count).collect(Collectors.toList());


    }

}
