package CloningTest;

public class Address implements  Cloneable{
    private  String addressId;
    private  String streetName;

    public Address(String addressId, String streetName) {
        this.addressId = addressId;
        this.streetName = streetName;
    }

    public String getAddressId() {
        return addressId;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    protected Object clone(){
        Object object = null;

        try {
            object = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return object;
    }
}
