package chap15;

public class TakeTaxiTest {
    public static void main(String[] args) {

        Student student = new Student("Edward", 20000);
        Taxi taxi = new Taxi("잘나간다 운수");

        student.takeTaxi(taxi);
        taxi.take(10000);

        student.showInfo();
        taxi.showInfo();
    }
}
