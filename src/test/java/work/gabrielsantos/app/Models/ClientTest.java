package work.gabrielsantos.app.Models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class ClientTest {

    Client client1;
    Client client2;
    Client client3;

    @Before
    public void setUp() throws Exception {
        client1 = new Client("Lucas", new Date() , "santos", null, null);
        client2 = new Client(2,"Lucas", new Date() , "santos", null, null,null, null);
        client3 = new Client(3,"Guilherme", new Date(), "guilherme", "guilherme@email.com", "88 1234-5678", Status.ACTIVE, null);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getUserStatus() {
        assertSame(client1.status , Status.INACTIVE);
        assertSame(client2.status, Status.INACTIVE);
        assertSame(client3.status, Status.ACTIVE);
    }
}