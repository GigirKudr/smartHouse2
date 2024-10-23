package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void increaseMaxVolume() {
        Radio radio = new Radio();
        radio.setVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        System.out.println("expected: " + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseMinVolume() {
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
        radio.setVolume(55);
        radio.increaseVolume();

        int expected = 56;
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
        radio.setVolume(55);
        radio.decreaseVolume();

        int expected = 54;
        int actual = radio.getCurrentVolume();
        System.out.println("expected: " + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void setStation() {
        Radio radio = new Radio(20);
        radio.setStation(5);

        int expected = 5;
        int actual = radio.getNumberStation();
        System.out.println("expected:" + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationInMaxWithParam() {
        Radio radio = new Radio(25);
        radio.setStation(24);

        int expected = 24;
        int actual = radio.getNumberStation();
        System.out.println("expected:" + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationInMaxNotParam() {
        Radio radio = new Radio();
        radio.setStation(9);

        int expected = 9;
        int actual = radio.getNumberStation();
        System.out.println("expected:" + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationInMinWithParam() {
        Radio radio = new Radio(25);
        radio.setStation(0);

        int expected = 0;
        int actual = radio.getNumberStation();
        System.out.println("expected:" + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationInMinNotParam() {
        Radio radio = new Radio();
        radio.setStation(0);

        int expected = 0;
        int actual = radio.getNumberStation();
        System.out.println("expected:" + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationWithParam() {
        Radio radio = new Radio(45);
        radio.setStation(25);

        int expected = 25;
        int actual = radio.getNumberStation();
        System.out.println("expected:" + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationNotParam() {
        Radio radio = new Radio();
        radio.setStation(5);

        int expected = 5;
        int actual = radio.getNumberStation();
        System.out.println("expected:" + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationNotParamOutOfRangeUp() {
        Radio radio = new Radio();
        radio.setStation(15);

        int expected = 0;
        int actual = radio.getNumberStation();
        System.out.println("expected:" + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationWithParamOutOfRangeUp() {
        Radio radio = new Radio(25);
        radio.setStation(27);

        int expected = 0;
        int actual = radio.getNumberStation();
        System.out.println("expected:" + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationNotParamOutOfRangeDown() {
        Radio radio = new Radio();
        radio.setStation(-27);

        int expected = 0;
        int actual = radio.getNumberStation();
        System.out.println("expected:" + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationWithParamOutOfRangeDown() {
        Radio radio = new Radio(25);
        radio.setStation(-27);

        int expected = 0;
        int actual = radio.getNumberStation();
        System.out.println("expected:" + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void nextStationWithParam() {
        Radio radio = new Radio(25);
        radio.setStation(10);
        radio.nextStation();

        int expected = 11;
        int actual = radio.getNumberStation();
        System.out.println("expected:" + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationNotParam() {
        Radio radio = new Radio();
        radio.setStation(5);
        radio.nextStation();

        int expected = 6;
        int actual = radio.getNumberStation();
        System.out.println("expected:" + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationMaxRangeWithParam() {
        Radio radio = new Radio(25);
        radio.setStation(24);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getNumberStation();
        System.out.println("expected:" + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationMaxRangeNotParam() {
        Radio radio = new Radio();
        radio.setStation(9);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getNumberStation();
        System.out.println("expected:" + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationMinRangeWithParam() {
        Radio radio = new Radio(25);
        radio.setStation(0);
        radio.nextStation();

        int expected = 1;
        int actual = radio.getNumberStation();
        System.out.println("expected:" + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationMinRangeNotParam() {
        Radio radio = new Radio();
        radio.setStation(0);
        radio.nextStation();

        int expected = 1;
        int actual = radio.getNumberStation();
        System.out.println("expected:" + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationMinRangeWithParam() {
        Radio radio = new Radio(25);
        radio.setStation(0);
        radio.prevStation();

        int expected = 24;
        int actual = radio.getNumberStation();
        System.out.println("expected:" + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationMinRangeNotParam() {
        Radio radio = new Radio();
        radio.setStation(0);
        radio.prevStation();

        int expected = 9;
        int actual = radio.getNumberStation();
        System.out.println("expected:" + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationMaxRangeWithParam() {
        Radio radio = new Radio(25);
        radio.setStation(24);
        radio.prevStation();

        int expected = 23;
        int actual = radio.getNumberStation();
        System.out.println("expected:" + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationMaxRangeNotParam() {
        Radio radio = new Radio();
        radio.setStation(9);
        radio.prevStation();

        int expected = 8;
        int actual = radio.getNumberStation();
        System.out.println("expected:" + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationWithParam() {
        Radio radio = new Radio(25);
        radio.setStation(10);
        radio.prevStation();

        int expected = 9;
        int actual = radio.getNumberStation();
        System.out.println("expected:" + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationNotParam() {
        Radio radio = new Radio();
        radio.setStation(5);
        radio.prevStation();

        int expected = 4;
        int actual = radio.getNumberStation();
        System.out.println("expected:" + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }


}