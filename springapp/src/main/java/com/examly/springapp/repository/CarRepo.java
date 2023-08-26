package com.examly.springapp.repository;

import com.examly.springapp.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepo extends JpaRepository<Car, Integer> {
    @Query("SELECT c FROM Car c WHERE c.owners = :owners")
    List<Car> findByOwners(int owners);
}