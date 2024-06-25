package com.prova2.city.mappers;

import com.prova2.city.dto.CityResponse;
import com.prova2.city.entities.City;

public class CityMapper {
    public static CityResponse toDTO(City city){
        return new CityResponse(city.getId(), city.getName(), city.getState(), city.getPopulation(), city.getPib());
    }
}
