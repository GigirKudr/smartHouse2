package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void maxVolume() {
        Radio radio = new Radio();
        radio.setVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        System.out.println("expected: " + expected + ", actual: " + actual);
    }

    @Test
    public void minVolume() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();
        System.out.println("expected: " + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        System.out.println("expected: " + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void decreaseMaxVolume() {
        Radio radio = new Radio();
        radio.setVolume(100);
        radio.decreaseVolume();

        int expected = 99;
        int actual = radio.getCurrentVolume();
        System.out.println("expected: " + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void decreaseMinVolume() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        System.out.println("expected: " + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(25);
        radio.decreaseVolume();

        int expected = 24;
        int actual = radio.getCurrentVolume();
        System.out.println("expected: " + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStation() {
        Radio radio = new Radio();
        radio.setStation(5);

        int expected = 5;
        int actual = radio.getNumberStation();
        System.out.println("expected:" + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationMin() {
        Radio radio = new Radio();
        radio.setStation(0);

        int expected = 0;
        int actual = radio.getNumberStation();
        System.out.println("expected:" + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationMax() {
        Radio radio = new Radio();
        radio.setStation(9);

        int expected = 9;
        int actual = radio.getNumberStation();
        System.out.println("expected:" + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationOutOfRange() {
        Radio radio = new Radio();
        radio.setStation(10);

        int expected = 0;
        int actual = radio.getNumberStation();
        System.out.println("expected:" + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationMax() {
        Radio radio = new Radio();
        radio.setStation(9);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getNumberStation();
        System.out.println("expected:" + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationMin() {
        Radio radio = new Radio();
        radio.setStation(0);
        radio.nextStation();

        int expected = 1;
        int actual = radio.getNumberStation();
        System.out.println("expected:" + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation() {
        Radio radio = new Radio();
        radio.setStation(5);
        radio.nextStation();

        int expected = 6;
        int actual = radio.getNumberStation();
        System.out.println("expected:" + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationMax() {
        Radio radio = new Radio();
        radio.setStation(9);
        radio.prevStation();

        int expected = 8;
        int actual = radio.getNumberStation();
        System.out.println("expected:" + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationMin() {
        Radio radio = new Radio();
        radio.setStation(0);
        radio.prevStation();

        int expected = 9;
        int actual = radio.getNumberStation();
        System.out.println("expected:" + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation() {
        Radio radio = new Radio();
        radio.setStation(5);
        radio.prevStation();

        int expected = 4;
        int actual = radio.getNumberStation();
        System.out.println("expected:" + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }


}