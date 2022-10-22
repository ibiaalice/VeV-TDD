package controller;

import domain.entities.Invoice;

public class SAPController {

    public String sendToSAP(Invoice invoice) { 
        String result = "Enviando nota fiscal para o SAP.";
		System.out.println(result);
    
        return result;
	}



    
}
