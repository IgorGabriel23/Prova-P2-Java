package com.prova2.city.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.prova2.city.dto.CityResponse;
import com.prova2.city.entities.City;
import com.prova2.city.mappers.CityMapper;
import com.prova2.city.repositories.CityRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class CityService {
    @Autowired
    private CityRepository cityRepository;

    public List<CityResponse> getCities(){
        List<City> cities = cityRepository.findAll();
       
        return cities.stream()
                       .map( s -> CityMapper.toDTO(s))
                       .collect(Collectors.toList());
    }

    public City getCityById(int id){
        return cityRepository.findById(id) .orElseThrow(() -> new EntityNotFoundException("Cidade não cadastrada"));
    }

    public void update(int id, City city) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    public void deleteCitytById(int id){
        if(this.cityRepository.existsById(id)){
            this.cityRepository.deleteById(id);
        }
        else{
            throw new EntityNotFoundException("Cidade não cadastrada");
        }
    }

}
