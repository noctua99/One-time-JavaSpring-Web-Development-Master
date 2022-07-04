package chapter03.ch16.scheduler;

public interface Scheduler {
    void getNextCall();

    void sendCallToAgent();
}
