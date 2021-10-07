package ua.com.itvdn.javaessencial.lecture1.hometask.task2;

import java.util.Locale;

public enum Color {
    RED, BLACK, WHITE, GREEN;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
