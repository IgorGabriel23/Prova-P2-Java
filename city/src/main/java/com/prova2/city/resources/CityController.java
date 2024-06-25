package com.prova2.city.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prova2.city.entities.City;

@RestController
@RequestMapping("cities")
public class CityController {
    @GetMapping
    public List<City> getCities(){
        City s1 = new City();
        s1.setId(1);
        s1.setName("Salto");
        s1.setState("Sao Paulo");
        s1.setPopulation(200000);
        s1.setPib(2);

        City s2 = new City();
        s2.setId(2);
        s2.setName("Itu");
        s2.setState("Sao Paulo");
        s2.setPopulation(260000);
        s2.setPib(3);
        
        City s3 = new City();
        s3.setId(3);
        s3.setName("Indaiatuba");
        s3.setState("Sao Paulo");
        s3.setPopulation(300000);
        s3.setPib(4);

        ArrayList<City> lista = new ArrayList<City>();
        lista.add(s1);
        lista.add(s2);
        lista.add(s3);

        return lista;

    }

}
