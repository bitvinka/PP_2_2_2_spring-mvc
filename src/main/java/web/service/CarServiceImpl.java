package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;
import java.util.stream.Stream;

@Service
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getCars(int count) {
        return Stream.of(
                        new Car("Toyota", 500, "silver"),
                        new Car("Volvo", 700, "blue"),
                        new Car("BMW", 900, "black"),
                        new Car("Mercedes", 150, "white"),
                        new Car("Lada", 9, "red"))
                .limit(count)
                .toList();
    }
}
