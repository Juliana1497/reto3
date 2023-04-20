package com.reto.reto3.repository;

import com.reto.reto3.model.AdminModel;
import com.reto.reto3.model.CarModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<CarModel,Integer> {
}