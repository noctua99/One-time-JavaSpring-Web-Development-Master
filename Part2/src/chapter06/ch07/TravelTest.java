package chapter06.ch07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TravelTest {

    public static void main(String[] args) {
        TravelCustomer customerLee = new TravelCustomer("이순신", 40, 100);
        TravelCustomer customerKim = new TravelCustomer("김유신", 20, 100);
        TravelCustomer customerHong = new TravelCustomer("홍길동", 13, 50);

        List<TravelCustomer> customerList = new ArrayList<>(
                Arrays.asList(customerLee, customerKim, customerHong));

        System.out.println("==고객 명단 출력==");
        customerList.stream().map(TravelCustomer::getName).forEach(System.out::println);

        System.out.println("==여행비용==");
        System.out.println(customerList.stream().mapToInt(TravelCustomer::getPrice).sum());
//        System.out.println(customerList.stream().map(TravelCustomer::getPrice).reduce(0, Integer::sum));

        System.out.println("==20세 이상 고객이름 정렬==");
        customerList.stream().filter(c -> c.getAge() >= 20).map(TravelCustomer::getName).sorted().forEach(System.out::println);

        /*customerList.stream().filter(c -> c.getAge() >= 20)
                .sorted(Comparator.comparing(TravelCustomer::getName))
                .map(TravelCustomer::getName)
                .forEach(a -> System.out.print(a + " "));*/
    }
}
