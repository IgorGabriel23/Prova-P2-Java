package com.prova2.city.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prova2.city.entities.City;

public interface CityRepository extends JpaRepository<City, Integer>{
    
}
