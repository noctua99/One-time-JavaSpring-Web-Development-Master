package chapter06.ch19;

public class CoffeeTest {

    public static void main(String[] args) {

        Coffee ethiopiaCoffee = new EthiopiaAmericano();
        ethiopiaCoffee.brewing();

        System.out.println();

        Coffee ethiopiaLatte = new Latte(ethiopiaCoffee);
        ethiopiaLatte.brewing();

        System.out.println();

        Coffee mochaEthiopia = new Mocha(new Latte(new EthiopiaAmericano()));
        mochaEthiopia.brewing();

        System.out.println();

        Coffee kenyaEthiopia = new WhippingCream(new Mocha(new Latte(new KenyaAmericano())));
        kenyaEthiopia.brewing();
    }
}
