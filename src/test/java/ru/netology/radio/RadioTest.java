package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void maxVolume() {
        Radio radio = new Radio();
        radio.setIncreaseVolume(100);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        System.out.println("expected: " + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minVolume() {
        Radio radio = new Radio();
        radio.setIncreaseVolume(0);
        int expected = 1;
        int actual = radio.getCurrentVolume();
        System.out.println("expected: " + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        Radio radio = new Radio();
        radio.setIncreaseVolume(55);

        int expected = 56;
        int actual = radio.getCurrentVolume();
        System.out.println("expected: " + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void decreaseVolume() {
        Radio radio = new Radio();
        radio.setDecreaseVolume(80);
        int expected = 79;
        int actual = radio.getCurrentVolume();
        System.out.println("expected: " + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void decreaseVolumeZero() {
        Radio radio = new Radio();
        radio.setDecreaseVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        System.out.println("expected: " + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStation() {
        Radio radio = new Radio(5);
        int expected = 5;
        int actual = radio.getNumberStation();
        System.out.println("expected:" + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationInMaxWithParam() {
        Radio radio = new Radio(25);
        int expected = 25;
        int actual = radio.getNumberStation();
        System.out.println("expected:" + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationInMaxNotParam() {
        Radio radio = new Radio();
        int expected = 10;
        int actual = radio.getNumberStation();
        System.out.println("expected:" + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationInMin() {
        Radio radio = new Radio();
        int expected = 10;
        int actual = radio.getNumberStation();
        System.out.println("expected:" + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void nextStationWithParam() {
        Radio radio = new Radio(25);
        radio.setNextStation(5);
        int expected = 6;
        int actual = radio.getNumberStation();
        System.out.println("expected:" + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationNotParam() {
        Radio radio = new Radio();
        radio.setNextStation(5);
        int expected = 6;
        int actual = radio.getNumberStation();
        System.out.println("expected:" + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationMaxRangeWithParam() {
        Radio radio = new Radio(25);
        radio.setNextStation(24);
        int expected = 0;
        int actual = radio.getNumberStation();
        System.out.println("expected:" + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationMaxRangeNotParam() {
        Radio radio = new Radio();
        radio.setNextStation(9);
        int expected = 0;
        int actual = radio.getNumberStation();
        System.out.println("expected:" + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationMaxRangeWithParamOutOfRange() {
        Radio radio = new Radio(25);
        radio.setNextStation(30);
        int expected = 0;
        int actual = radio.getNumberStation();
        System.out.println("expected:" + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationMaxRangeNotParamOutOfRange() {
        Radio radio = new Radio();
        radio.setNextStation(30);
        int expected = 0;
        int actual = radio.getNumberStation();
        System.out.println("expected:" + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationWithParam() {
        Radio radio = new Radio(25);
        radio.setPrevStation(5);
        int expected = 4;
        int actual = radio.getNumberStation();
        System.out.println("expected:" + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationNotParam() {
        Radio radio = new Radio();
        radio.setPrevStation(5);
        int expected = 4;
        int actual = radio.getNumberStation();
        System.out.println("expected:" + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationMinRangeWithParam() {
        Radio radio = new Radio(25);
        radio.setPrevStation(0);
        int expected = 24;
        int actual = radio.getNumberStation();
        System.out.println("expected:" + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationMinRangeNotParam() {
        Radio radio = new Radio();
        radio.setPrevStation(0);
        int expected = 9;
        int actual = radio.getNumberStation();
        System.out.println("expected:" + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationOutOfRangeWithParam() {
        Radio radio = new Radio(25);
        radio.setPrevStation(-10);
        int expected = 24;
        int actual = radio.getNumberStation();
        System.out.println("expected:" + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationOutOfRangeNotParam() {
        Radio radio = new Radio();
        radio.setPrevStation(-10);
        int expected = 9;
        int actual = radio.getNumberStation();
        System.out.println("expected:" + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }
}