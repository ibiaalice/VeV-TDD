import static org.junit.Assert.assertEquals;

import org.junit.Test;

import controller.SAPController;
import domain.entities.Invoice;



public class SAPTest {

    SAPController sapController = new SAPController();

    @Test
    public void testSendSAP() {
        Invoice invoice = new Invoice("João", 100.0f, 10.0f);

        assertEquals("Enviando nota fiscal para o SAP.",sapController.sendToSAP(invoice));
    }

    @Test
    public void testSendSAP2() {
        Invoice invoice = new Invoice("Maria", 200.0f, 20.0f);
        Invoice invoice2 = new Invoice("João", 200.0f, 10.0f);

        assertEquals(sapController.sendToSAP(invoice2),sapController.sendToSAP(invoice));
    }
    
}
