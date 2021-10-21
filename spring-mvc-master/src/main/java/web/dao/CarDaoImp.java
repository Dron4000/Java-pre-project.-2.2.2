package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImp implements CarDao {

    @Override
    public List<Car> getListCar(List<Car> list, int count) {

        return list.stream().limit(count).collect(Collectors.toList());
    }

}
