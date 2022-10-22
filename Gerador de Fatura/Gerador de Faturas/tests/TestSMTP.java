import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import controller.SMTPController;
import domain.entities.Invoice;


public class TestSMTP {
    SMTPController smtpController = new SMTPController();


    @Test
    public void testCreateSMTP() {
        Invoice invoice = new Invoice("João", 100.0f, 10.0f);

        assertEquals("Enviando nota fiscal para o cliente João", smtpController.sendEmail(invoice));
    }

    @Test
    public void testCreateSMTP2() {
        Invoice invoice = new Invoice("João", 100.0f, 10.0f);
        Invoice invoice2 = new Invoice("Maria", 200.0f, 20.0f);

        assertNotEquals(smtpController.sendEmail(invoice), smtpController.sendEmail(invoice2));
    }

    
    
}
