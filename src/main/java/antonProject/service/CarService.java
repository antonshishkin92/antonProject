package antonProject.service;

import antonProject.model.Car;

import java.util.Optional;

public interface CarService {
    Optional<Car> findById(Long id);
    Car save(Car car);
    void deleteById(Long id);
}
