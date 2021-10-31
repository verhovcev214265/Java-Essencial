package ua.com.itvdn.javaessencial.lecture3.hometasks.task1;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static final String PURPLE_TEXT = "\u001B[35m";
    public static final String WHITE_TEXT = "\u001B[37m";

    public static void main(String[] args) {

        System.out.println("Enter (pl) for play\n" +
                "Enter (r) for recording\n" +
                "Enter (p) for pause\n" +
                "Enter (s) for stop\n" +
                "Enter (pr) for playing and recording\n" +
                "If you want exit, enter (q)");

        Scanner scan = new Scanner(System.in);

        Player[] buttons = new Player[6];

        for (int i = 0; i < 100; i++) {

            String input = scan.nextLine().toLowerCase();

            try {
                if (input.equals("q")) {
                    System.out.println(WHITE_TEXT + "Good bye!");
                    i = 101;
                } else {
                    switch (input) {
                        case "pl":
                            buttons[0] = new Player(input);
                            buttons[0].play();
                            continue;
                        case "r":
                            buttons[1] = new Player(input);
                            buttons[1].record();
                            continue;
                        case "p":
                            buttons[2] = new Player(input);
                            buttons[2].pause();
                            continue;
                        case "s":
                            buttons[3] = new Player(input);
                            buttons[3].stop();
                            continue;
                        case "pr":
                            buttons[4] = new Player(input);
                            buttons[4].play();
                            buttons[5] = new Player(input);
                            buttons[5].record();
                            continue;
                        default:
                            throw new IOException();
                    }
                }
            } catch (IOException e) {
               e.printStackTrace();
               System.out.println(PURPLE_TEXT + "Error input / output data from the file!");
            }
        }
        scan.close();
    }
}
