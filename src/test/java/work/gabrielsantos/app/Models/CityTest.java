package work.gabrielsantos.app.Models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.Assert.*;

public class CityTest {

    City city1;
    City city2;
    City city3;

    @Before
    public void setUp() {
        city1 = new City("Fortaleza");
        city2 = new City("San Francisco");
        city3 = new City(new Date().getTime(), "Zurich", WeatherConditions.RAINY, 10000);
    }

    @After
    public void tearDown() {

    }

    @Test
    public void getName() {
        assertTrue(city1.getName().equals("Fortaleza"));
        assertTrue(city2.getName().equals("San Francisco"));
        assertTrue(city3.getName().equals("Zurich"));
    }

    @Test
    public void setName() {
        city1.setName("London");
        assertEquals( "London", city1.getName());
    }

    @Test
    public void getPopulation() {
        assertEquals(0, city1.getPopulation(), 0);
        assertEquals(0, city2.getPopulation(),0);
        assertEquals(10000, city3.getPopulation());
    }

    @Test
    public void getFee() {
        assertTrue(city3.getFee() == 6.3);
    }

    @Test
    public void setFee() {
        int population = 20000;
        city1.setFee(((population / 5000 ) * 0.7) == 6.3 ? 6.3 : ((population / 5000 ) * 0.7));
        assertEquals(2.8, city1.getFee(), 0.01);
    }
}