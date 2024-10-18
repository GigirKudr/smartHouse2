package ru.netology.radio;

public class Radio {
    private int numberStation = 10;
    private int currentVolume;

    public Radio(int numberStation) {
        this.numberStation = numberStation;
    }

    public Radio() {

    }

    public int getNumberStation() {
        return numberStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }


    public void setIncreaseVolume(int newCurrentVolume) {
        if (newCurrentVolume == 100) {
            currentVolume = 100;
            return;
        }
        currentVolume = newCurrentVolume + 1;
    }


    public void setDecreaseVolume(int newCurrentVolume) {
        if (newCurrentVolume == 0) {
            currentVolume = 0;
            return;
        }

        currentVolume = newCurrentVolume - 1;
    }

    public void setNumberStation(int newNumberStation) {
        if (newNumberStation <= numberStation && newNumberStation >= 0) {
            numberStation = newNumberStation;
        }
        return;
    }

    public void setNextStation(int newNumberStation) {
        if (newNumberStation >= numberStation - 1) {
            numberStation = 0;
            return;
        }
        numberStation = newNumberStation + 1;
    }

    public void setPrevStation(int newNumberStation) {
        if (newNumberStation <= 0) {
            numberStation = numberStation - 1;
            return;
        }
        numberStation = newNumberStation - 1;
    }
}



