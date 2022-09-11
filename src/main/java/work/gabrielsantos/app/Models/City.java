package work.gabrielsantos.app.Models;

import java.util.ArrayList;
import java.util.Date;

public class City {
    public long id;
    public String name;
    public WeatherConditions weatherConditions;
    public ArrayList<Object> attractions;
    public long population;
    public double fee;

    public City(String name) {
        this.id = new Date().getTime();
        this.name = name;
        this.weatherConditions = WeatherConditions.SUNNY;
    }

    public City(long id, String name, WeatherConditions weather, long population) {
        this.id = id;
        this.name = name;
        this.weatherConditions = weather;
        this.population = population;
        this.fee = ((this.population / 5000) * 0.7) == 6.3 ? ((this.population / 5000) * 0.7) : 6.3 ;
    }

    public City(long id, String name, WeatherConditions weather, ArrayList<Object> attractions, long population) {
        this.id = id;
        this.name = name;
        this.weatherConditions = weather;
        this.attractions = attractions;
        this.population = population;
        this.fee = ((this.population / 5000) * 0.7) == 6.3 ? ((this.population / 5000) * 0.7) : 6.3 ;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WeatherConditions getWeatherConditions() {
        return weatherConditions;
    }

    public void setWeatherConditions(WeatherConditions weatherConditions) {
        this.weatherConditions = weatherConditions;
    }

    public ArrayList<Object> getAttractions() {
        return attractions;
    }

    public void setAttractions(ArrayList<Object> attractions) {
        this.attractions = attractions;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

}
