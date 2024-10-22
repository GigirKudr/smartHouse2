package ru.netology.radio;

public class Radio {
    private int numberStation = 9;
    private int currentVolume;

    public Radio(int numberStation) {
        this.numberStation = numberStation - 1;
    }

    public Radio() {

    }

    public int getNumberStation() {
        return numberStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int setVolume(int volume) {
        return currentVolume = volume;
    }

    public int setStation(int station) {
        if (station <= numberStation && station != 0) {
            return numberStation = station - 1;
        }
        return numberStation = 0;
    }


    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume == 100) {
            currentVolume = 100;
        }
    }


    public void decreaseVolume() {
        if (currentVolume <= 100 && currentVolume != 0) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume == 0) {
            currentVolume = 0;
        }
    }


    public void nextStation(int newNumberStation) {
        if (newNumberStation < numberStation - 1) {
            numberStation = newNumberStation + 1;
        }
        if (newNumberStation == numberStation) {
            numberStation = 0;
        }
    }

    public void prevStation(int newNumberStation) {
        if (newNumberStation > 0) {
            numberStation = newNumberStation - 1;
        }
        if (newNumberStation == 0) {
            newNumberStation = numberStation;
        }
    }
}



