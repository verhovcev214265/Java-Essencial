package ua.com.itvdn.javaessencial.lecture1.hometask.task4;

public enum Color {
    WHITE, BLACK, GREEN, RED;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
