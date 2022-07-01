package chapter03.ch06;

public class VIPCustomer extends Customer {

    double salesRatio;
    private String agentID;

    /*public VIPCustomer() {
        bonusRatio = 0.05;
        salesRatio=0.1;
        customerGrade = "VIP";

        System.out.println("VIPCustomer() call");
    }*/

    public VIPCustomer(int customerID, String customerName) {
        super(customerID, customerName);

        bonusRatio = 0.05;
        salesRatio = 0.1;
        customerGrade = "VIP";

//        System.out.println("VIPCustomer(int, String) call");
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int) (price * salesRatio);
    }

    public String getAgentID() {
        return agentID;
    }
}
