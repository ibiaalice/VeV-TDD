import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import controller.BillController;

public class TestBillController {

    @Test
    public void testCreateBillController() {
        BillController billController = new BillController();
        assertEquals("Classe de controle de fatura", billController.toString());
    }

    @Test
    public void testCreateBill() {
        BillController billController = new BillController();
        assertEquals("Bill [address=Rua 1, name=João, serviceType=CONSULTORIA, value=100.0]", billController.createBill("João", "Rua 1", "CONSULTORIA", 100.0f).toString());
    }

    @Test
    public void testCreateBill2() {
        BillController billController = new BillController();
        BillController billController2 = new BillController();
        assertEquals(billController2.createBill("João", "Rua 1", "CONSULTORIA", 100.0f).toString(), billController.createBill("João", "Rua 1", "CONSULTORIA", 100.0f).toString());
    }

    @Test
    public void testCreateBill3() {
        BillController billController = new BillController();
        assertNotEquals(billController.createBill("João", "Rua 1", "CONSULTORIA", 100.0f).toString(), billController.createBill("Maria", "Rua 1", "CONSULTORIA", 100.0f).toString());
    }

    

    
}
