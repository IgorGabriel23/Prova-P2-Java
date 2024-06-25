package com.prova2.city.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prova2.city.dto.CityResponse;
import com.prova2.city.entities.City;
import com.prova2.city.services.CityService;

@RestController
@RequestMapping("cities")
public class CityController {
    
    @Autowired
    private CityService cityService;

    @GetMapping
    public ResponseEntity<List<CityResponse>> getCities(){
        return ResponseEntity.ok(cityService.getCities());
    }

    @GetMapping("{id}")
    public ResponseEntity<City> getCityById(@PathVariable int id){
        return ResponseEntity.ok(cityService.getCityById(id));
    }

    @PutMapping("{id}")
    public void update(@PathVariable int id, @RequestBody City city){
        this.cityService.update(id, city);
    }

    @DeleteMapping("{id}")
    public void deleteCitytById(@PathVariable int id){
        this.cityService.deleteCitytById(id);
    }

}
