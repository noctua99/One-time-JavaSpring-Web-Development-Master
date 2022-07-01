package chapter02.ch15;

public class Student {

    private final String name;
    private int money;

    public Student(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void takeTaxi(Taxi taxi) {
        taxi.take(10000);
        money -= 10000;
    }

    public void showInfo() {
        System.out.println(name + "님의 남은 돈은 " + money + "원 입니다.");
    }
}
