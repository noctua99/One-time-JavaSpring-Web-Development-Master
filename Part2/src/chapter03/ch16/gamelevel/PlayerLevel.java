package chapter03.ch16.gamelevel;

public abstract class PlayerLevel {

    abstract void run();

    abstract void jump();

    abstract void turn();

    abstract void showLevelMessage();

    public void go(int count) {
        run();
        while (count-- > 0) {
            jump();
        }
        turn();
    }
}
