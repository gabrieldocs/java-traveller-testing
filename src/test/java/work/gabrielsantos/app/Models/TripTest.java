package work.gabrielsantos.app.Models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class TripTest {

    Trip trip1;
    City city1;
    City city2;
    Client client1;

    @Before
    public void setUp() throws Exception {
        city1 = new City("San Francisco");
        city2 = new City(new Date().getTime(), "Zurich", WeatherConditions.RAINY, 10000);
        client1 = new Client(3,"Guilherme", new Date(), "guilherme", "guilherme@email.com", "88 1234-5678", Status.ACTIVE, null);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void createTrip() {
        trip1 = new Trip(
          client1,
          new Date(),
          new Date(),
          city1,
          city2
        );

        assertTrue(trip1.client.name.equals("Guilherme"));
        assertTrue(trip1.city_ini.getName() == "San Francisco");
        assertTrue(trip1.city_dest.getName() == "Zurich");
    }
}