package controller;

import domain.entities.Bill;
import domain.entities.Invoice;

public class InvoiceController {
    
        public InvoiceController() {
            
        }
    
        public Invoice createInvoice(Bill bill) {
            Float tax = selectTax(bill.getServiceType());
            Float totalValue = calculateValue(bill.getValue(), tax);
            
            return new Invoice(bill.getName(), totalValue , tax);
        }


        public String saveInvoice(Invoice invoice) {
            String result = "Salvando nota fiscal no banco de dados.";
            System.out.println(result);
            return result;

        }

        private Float selectTax(String serviceType){
            switch (serviceType) {
                case "CONSULTORIA":
                    return 25.0f;
                case "TREINAMENTO":
                    return 15.0f;
                default:
                    return 6.0f;
            }

        }



        private Float calculateValue(Float value, Float tax) {
            
            return value + (value * tax / 100);
        }
    
        @Override
        public String toString() {
            return "Classe de controle de nota fiscal";
        }
        
}
