package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private final List<Car> cars;

    public CarService() {
        this.cars = new ArrayList<>();
        cars.add(new Car("Lexus", "Lx 570", 2021));
        cars.add(new Car("Mitsubishi", "Asx", 2014));
        cars.add(new Car("Toyota", "Rav 4", 2018));
        cars.add(new Car("Renault", "Logan", 2015));
        cars.add(new Car("Chevrolet ", "Onix", 2022));
    }

    public List<Car> getCars(Integer count){
        if(count == null || count >= 5){
            return cars;
        }
        return cars.subList(0, count);
    }
}
