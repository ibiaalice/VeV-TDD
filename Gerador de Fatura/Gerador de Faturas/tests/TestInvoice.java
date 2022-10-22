import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import domain.entities.Invoice;


public class TestInvoice {

    @Test
    public void testCreateInvoice() {
        Invoice invoice = new Invoice("João", 100.0f, 10.0f);
        assertEquals("João", invoice.getName());
        assertEquals(100.0f, invoice.getValue(), 0.001);
        assertEquals(10.0f, invoice.getTax(), 0.001);
    }

    @Test
    public void testToString() {
        Invoice invoice = new Invoice("João", 100.0f, 10.0f);
        assertEquals("Nota fiscal no valor de 100.0 com taxa de 10.0 para o cliente João", invoice.toString());
    }

    @Test
    public void testSetters() {
        Invoice invoice = new Invoice("João", 100.0f, 10.0f);
        invoice.setName("Maria");
        invoice.setValue(200.0f);
        invoice.setTax(20.0f);
        assertEquals("Maria", invoice.getName());
        assertEquals(200.0f, invoice.getValue(), 0.001);
        assertEquals(20.0f, invoice.getTax(), 0.001);
    }

    @Test
    public void testGetters() {
        Invoice invoice = new Invoice("João", 100.0f, 10.0f);
        assertEquals("João", invoice.getName());
        assertEquals(100.0f, invoice.getValue(), 0.001);
        assertEquals(10.0f, invoice.getTax(), 0.001);
    }

    @Test
    public void testCreateInvoice2() {
        Invoice invoice = new Invoice("Maria", 200.0f, 20.0f);
        Invoice invoice2 = new Invoice("João", 200.0f, 10.0f);
       
        assertNotEquals(invoice2.getName(), invoice.getName());
        assertEquals(invoice2.getValue(), invoice.getValue(), 0.001);
        assertNotEquals(invoice2.getTax(), invoice.getTax(), 0.001);
    }
    

}
