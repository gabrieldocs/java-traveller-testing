package work.gabrielsantos.app.Models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WalletTest {

    Wallet wallet;
    Wallet security_wallet;

    @Before
    public void setUp() throws Exception {
        wallet = new Wallet("Sample", 10.000, 2.000, 3.000);
        security_wallet = new Wallet( 3.000, 400.00, 1.500);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getAmount() {
        assertTrue(wallet.getAmount() == 10.000);
        assertTrue(security_wallet.getAmount() == 3.000);
    }

    @Test
    public void setAmount() {
        wallet.setAmount(20.000);
        security_wallet.setAmount(5.000);
        assertTrue(wallet.getAmount() == 20.000);
        assertTrue(security_wallet.getAmount() == 5.000);
    }

    @Test
    public void getCredit() {
        assertTrue(wallet.getCredit() == 2.000);
    }

    @Test
    public void setCredit() {
        wallet.setCredit(500.00);
        assertEquals( 500.00, wallet.getCredit(), 0.02);
    }

    @Test
    public void getDebit() {
        assertTrue(wallet.getDebit()==3.000);
    }

    @Test
    public void setDebit() {
        wallet.setDebit(5.000);
        assertTrue(wallet.getDebit() == 5.000);
    }

    @Test
    public void getName() {
        assertTrue(wallet.name.equals("Sample"));
        assertTrue(security_wallet.name == null);
    }

    @Test
    public void compareWallets() {
        assertFalse(wallet.equals(security_wallet));
    }
}