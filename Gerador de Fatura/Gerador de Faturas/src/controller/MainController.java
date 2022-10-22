package controller;

import domain.entities.Bill;
import domain.entities.Invoice;

public class MainController {

    SMTPController smtpController = new SMTPController();
    SAPController sapController = new SAPController();
    BillController billController = new BillController();
    InvoiceController invoiceController = new InvoiceController();

    public MainController() {}

    public void generatedInvoice(String name, String address, String serviceType, Float value) {
        Bill bill = billController.createBill(name, address, serviceType, value);
        Invoice invoice = invoiceController.createInvoice(bill);
       
        invoiceController.saveInvoice(invoice);
        sapController.sendToSAP(invoice);
        smtpController.sendEmail(invoice);
    }


    
}
