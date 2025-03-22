package com.kurinto.forexams.car;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Transactional
public interface CarRepository extends JpaRepository<Car, Integer> {

}
