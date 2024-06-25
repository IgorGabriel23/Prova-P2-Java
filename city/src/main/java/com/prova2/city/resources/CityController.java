package com.prova2.city.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prova2.city.entities.City;
import com.prova2.city.services.CityService;

@RestController
@RequestMapping("cities")
public class CityController {
    
    @Autowired
    private CityService cityService;

    @GetMapping
    public List<City> getCities(){
        return cityService.getCities();
    }

    @GetMapping("{id}")
    public City getCityById(@PathVariable int id){
        return cityService.getCityById(id);
    }

    @DeleteMapping("{id}")
    public void deleteCitytById(@PathVariable int id){
        this.cityService.deleteCitytById(id);
    }
}
