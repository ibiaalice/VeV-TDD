package domain.entities;

public class Invoice {
    private String name;
    private Float value;
    private Float tax;

    public Invoice(String name, Float value, Float tax) {
        this.name = name;
        this.value = value;
        this.tax = tax;
    }

    public String getName() {
        return name;
    }
    
    public Float getValue() {
        return value;
    }

    public Float getTax() {
        return tax;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(Float value) {
        this.value = value;
    }

    public void setTax(Float tax) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        return "Nota fiscal no valor de " + value + " com taxa de " + tax + " para o cliente " + name;
    }
    
}
