package CloningTest;

public class CloningTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("a1", "street1");
//        Address address1 = (Address) address.clone();
        Investor investor1 = new Investor("investor1", "test investor", address);
        Investor investor2 = investor1;
        Investor investor3 = investor1.clone();


        if (investor1 == investor2) {
            System.out.println("reference equals");
        } else {
            System.out.println("not equals");
        }

//        investor3.getAddress().setStreetName("street2");
        investor1.setInvestorName("investor10");

        System.out.println(investor1.getInvestorName());
        System.out.println(investor3.getInvestorName());

        System.out.println(investor1.getAddress().getStreetName());
        System.out.println(investor3.getAddress().getStreetName());


//        System.out.println(address1.getAddressId());
//        System.out.println(address1.getStreetName());
    }
}
