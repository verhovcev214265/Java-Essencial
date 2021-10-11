package ua.com.itvdn.javaessencial.lecture3.hometasks.task1;

public class Player implements Playable , Recordable {

    public static final String BLACK_TEXT = "\u001B[30m";
    public static final String YELLOW_TEXT = "\u001B[33m";
    public static final String RED_TEXT = "\u001B[31m";
    public static final String GREEN_TEXT = "\u001B[32m";

    private String command;

    public Player(String command) {
        this.command = command;
    }

    @Override
    public void play() {
        System.out.println(GREEN_TEXT + "Play");
    }

    @Override
    public void pause() {
        System.out.println(YELLOW_TEXT + "Pause");
    }

    @Override
    public void stop() {
        System.out.println(BLACK_TEXT + "Stop");
    }

    @Override
    public void record() {
        System.out.println(RED_TEXT + "Record");
    }
}
