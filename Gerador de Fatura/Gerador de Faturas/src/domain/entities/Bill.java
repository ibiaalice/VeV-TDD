package domain.entities;

public class Bill {
    private String name;
    private String address;
    private String serviceType;
    private Float value;

    public Bill(String name, String address, String serviceType, Float value) {
        this.name = name;
        this.address = address;
        this.serviceType = serviceType;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getServiceType() {
        return serviceType;
    }

    public Float getValue() {
        return value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public void setValue(Float value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Bill [address=" + address + ", name=" + name + ", serviceType=" + serviceType + ", value=" + value + "]";
    }

    
}
