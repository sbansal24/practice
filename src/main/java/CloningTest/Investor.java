package CloningTest;

import java.util.LinkedHashMap;
import java.util.Map;

public class Investor implements Cloneable {
    private String investorId;
    private String investorName;
    private Address address;
    private int id;

    public Investor(String investorId, String investorName, Address address) {
        this.investorId = investorId;
        this.investorName = investorName;
        this.address = address;
    }

    public Investor() {

    }

    public String getInvestorId() {
        return investorId;
    }

    public String getInvestorName() {
        return investorName;
    }

    public Address getAddress() {
        return address;
    }

    public void setInvestorId(String investorId) {
        this.investorId = investorId;
    }

    public void setInvestorName(String investorName) {
        this.investorName = investorName;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    //shallow copy
    protected Investor clone() {
        Investor investor = null;
        try {
            investor = (Investor) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return investor;
    }

    //deep copy
//    @Override
//    protected Investor clone() throws CloneNotSupportedException {
////        Investor investor;
////        Investor investor = new Investor();
////        investor.setInvestorId(investorId);
////        investor.setInvestorName(investorName);
//        Investor investor = (Investor) super.clone();
//        investor.setAddress(new Address(address.getAddressId(), address.getStreetName()));
//        return investor;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Investor investor = (Investor) o;

        if (id != investor.id) return false;
        if (investorId != null ? !investorId.equals(investor.investorId) : investor.investorId != null) return false;
        if (investorName != null ? !investorName.equals(investor.investorName) : investor.investorName != null)
            return false;
        return address != null ? address.equals(investor.address) : investor.address == null;
    }

    @Override
    public int hashCode() {

        int result = investorId != null ? investorId.hashCode() : 0;
        result = 31 * result + (investorName != null ? investorName.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + id;
        return result;
    }
}
