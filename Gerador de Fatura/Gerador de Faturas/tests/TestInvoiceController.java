import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import controller.InvoiceController;
import domain.entities.Bill;
import domain.entities.Invoice;

public class TestInvoiceController {

    @Test
    public void testCreateInvoiceController() {
        InvoiceController invoiceController = new InvoiceController();
        assertEquals("Classe de controle de nota fiscal", invoiceController.toString());
    }

    @Test
    public void testCreateInvoice() {
        InvoiceController invoiceController = new InvoiceController();
        Bill bill = new Bill("João", "Rua 1", "CONSULTORIA", 100.0f);
        assertEquals("João", invoiceController.createInvoice(bill).getName());
        assertEquals(125.0f, invoiceController.createInvoice(bill).getValue(), 0.0f);
        assertEquals(25.0f, invoiceController.createInvoice(bill).getTax(), 0.0f);
        assertNotEquals("Maria", invoiceController.createInvoice(bill).getName());
        assertNotEquals(0 , invoiceController.createInvoice(bill).getValue());
    }

    @Test
    public void testCreateInvoice2() {
        InvoiceController invoiceController = new InvoiceController();
        Bill bill = new Bill("João", "Rua 1", "CONSULTORIA", 100.0f);
        Bill bill2 = new Bill("Maria", "Rua 1", "TREINAMENTO", 200.0f);
        
        assertNotEquals(invoiceController.createInvoice(bill).getName(), invoiceController.createInvoice(bill2).getName());
        assertEquals(230.0f, invoiceController.createInvoice(bill2).getValue(), 0.0f);
        assertEquals(15.0f, invoiceController.createInvoice(bill2).getTax(), 0.0f);
        assertNotEquals(25.0f, invoiceController.createInvoice(bill2).getTax(), 0.0f);
        assertNotEquals(bill, bill2);
    }

    @Test
    public void testSaveInvoice() {
        InvoiceController invoiceController = new InvoiceController();
        Bill bill = new Bill("João", "Rua 1", "CONSULTORIA", 100.0f);
        Invoice invoice = invoiceController.createInvoice(bill);
        assertEquals("Salvando nota fiscal no banco de dados.", invoiceController.saveInvoice(invoice));
    }
    
}
