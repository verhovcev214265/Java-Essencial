package ua.com.itvdn.javaessencial.lecture1.hometask.task3;

public enum Color {
    RED, BLACK, WHITE, GREEN;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
