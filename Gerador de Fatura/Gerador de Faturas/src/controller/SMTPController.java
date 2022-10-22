package controller;

import domain.entities.Invoice;

public class SMTPController {

    public String sendEmail( Invoice invoice) {
        String email ="Enviando nota fiscal para o cliente " + invoice.getName();

        System.out.println(email);
        
        return email;
    }


    
}
