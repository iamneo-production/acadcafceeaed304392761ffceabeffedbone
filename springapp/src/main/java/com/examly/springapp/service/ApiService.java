package com.examly.springapp.service;

import com.examly.springapp.model.Car;
import com.examly.springapp.repository.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApiService {
    private final CarRepo carRepo;

    @Autowired
    public ApiService(CarRepo carRepo) {
        this.carRepo = carRepo;
    }

    public List<Car> getCarsByOwners(int owners) {
        return carRepo.findByOwners(owners);
    }
}
