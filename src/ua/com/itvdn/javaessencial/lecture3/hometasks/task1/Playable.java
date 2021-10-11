package ua.com.itvdn.javaessencial.lecture3.hometasks.task1;

//Создайте 2 интерфейса Playable и Recordable. В каждом из интерфейсов создайте по 3 метода void play() /
//void pause() / void stop() и void record() / void pause() / void stop() соответственно.
//Создайте производный класс Player от базовых интерфейсов Playable и Recordable.
//Написать программу, которая выполняет проигрывание и запись.

interface Playable {

    void play();

    void pause();

    void stop();
}
