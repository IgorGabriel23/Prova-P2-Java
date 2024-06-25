package com.prova2.city.entities;

public class City {
    private Integer id;
    private String name;
    private String state;
    private Integer population;
    private Integer pib;
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public Integer getPopulation() {
        return population;
    }
    public void setPopulation(Integer population) {
        this.population = population;
    }
    public Integer getPib() {
        return pib;
    }
    public void setPib(Integer pib) {
        this.pib = pib;
    } 
    
}
