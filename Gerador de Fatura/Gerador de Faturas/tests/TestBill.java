import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import domain.entities.Bill;


public class TestBill {

    @Test
    public void testCreateBill() {
        Bill bill = new Bill("João", "Rua 1", "CONSULTORIA", 100.0f);
        assertEquals("João", bill.getName());
        assertEquals("Rua 1", bill.getAddress());
        assertEquals("CONSULTORIA", bill.getServiceType());
        assertEquals(100.0f, bill.getValue(), 0.001);
    }

    @Test
    public void testToString() {
        Bill bill = new Bill("João", "Rua 1", "CONSULTORIA", 100.0f);
        assertEquals("Bill [address=Rua 1, name=João, serviceType=CONSULTORIA, value=100.0]", bill.toString());
    }

    @Test
    public void testSetters() {
        Bill bill = new Bill("João", "Rua 1", "CONSULTORIA", 100.0f);
        bill.setName("Maria");
        bill.setAddress("Rua 2");
        bill.setServiceType("TREINAMENTO");
        bill.setValue(200.0f);
        assertEquals("Maria", bill.getName());
        assertEquals("Rua 2", bill.getAddress());
        assertEquals("TREINAMENTO", bill.getServiceType());
        assertEquals(200.0f, bill.getValue(), 0.001);
    }

    @Test
    public void testGetters() {
        Bill bill = new Bill("João", "Rua 1", "CONSULTORIA", 100.0f);
        assertEquals("João", bill.getName());
        assertEquals("Rua 1", bill.getAddress());
        assertEquals("CONSULTORIA", bill.getServiceType());
        assertEquals(100.0f, bill.getValue(), 0.001);
    }

    @Test
    public void testCreateBill2() {
        Bill bill = new Bill("Maria", "Rua 2", "TREINAMENTO", 200.0f);
        Bill bill2 = new Bill("João", "Rua 2", "CONSULTORIA", 200.0f);
       
        assertNotEquals(bill2.getName(), bill.getName());
        assertEquals(bill2.getAddress(), bill.getAddress());
        assertNotEquals(bill2.getServiceType(), bill.getServiceType());
        assertEquals(200.0f, bill.getValue(), 0.001);
    }
    
}
