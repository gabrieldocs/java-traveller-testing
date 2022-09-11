package work.gabrielsantos.app.Models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class AgencyTest {

    Agency agency1;
    Agency agency2;
    Client client1;
    @Before
    public void setUp() throws Exception {
        agency1 = new Agency("Travelller");
        agency2 = new Agency("Voyager", 6.00, Seasons.FALL);
        client1 = new Client("Lucas", new Date() , "santos", null, null);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getNameTest() {
        assertTrue(agency1.getName().equals("Travelller"));
    }

    @Test
    public void setNameTest() {
        agency1.setName("Travell");
        assertTrue(agency1.getName().equals("Travell"));
    }

    @Test
    public void setClients() {
        agency1.addClient(client1);
        agency1.addClient(client1);
        agency1.addClient(client1);
        agency1.addClient(client1);
        agency1.addClient(client1);
        assertTrue(agency1.getClients().size()==5);
    }

    @Test
    public void addClient() {
        agency1.addClient(client1);
        agency1.addClient(client1);
        agency1.addClient(client1);
        agency1.addClient(client1);
        agency1.addClient(client1);
        assertTrue(agency1.getClients().size()==5);
    }
}