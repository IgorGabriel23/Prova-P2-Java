package com.prova2.city.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.prova2.city.entities.City;
import com.prova2.city.repositories.CityRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class CityService {
    @Autowired
    private CityRepository cityRepository;

    public List<City> getCities(){
        return cityRepository.findAll();
    }

    public City getCityById(int id){
        return cityRepository.findById(id) .orElseThrow(() -> new EntityNotFoundException("Cidade não cadastrada"));
    }

    public void update(int id, City city) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    
}
