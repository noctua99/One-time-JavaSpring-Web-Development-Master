package chapter02.ch15;

public class Taxi {

    private final String companyName;
    private int income = 0;

    public Taxi(String companyName) {
        this.companyName = companyName;
    }

    public void take(int money) {
        income += money;
    }

    public void showInfo() {
        System.out.println(companyName + "택시의 수입은 " + income + "원 입니다.");
    }
}
