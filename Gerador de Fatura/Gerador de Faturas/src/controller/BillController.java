package controller;

import domain.entities.Bill;

public class BillController {
    
    public BillController() {
        
    }

    public Bill createBill(String name, String address, String serviceType, Float value) {
        return new Bill(name, address, serviceType, value);
    }

    @Override
    public String toString() {
        return "Classe de controle de fatura";
    }
    
}
