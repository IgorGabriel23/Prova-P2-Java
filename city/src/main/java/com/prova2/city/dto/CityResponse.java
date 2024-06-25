package com.prova2.city.dto;

public record CityResponse() {
    public record CityResponse(int id, String name, String state, int population, int pib){
        
    }
}
