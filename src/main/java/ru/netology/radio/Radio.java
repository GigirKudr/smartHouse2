package ru.netology.radio;

public class Radio {
    private int numberStation;
    private int currentVolume;

    public int getNumberStation() {
        return numberStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int setVolume(int volume) {
        return currentVolume = volume;
    }

    public void setStation(int numberStation) {
        if (numberStation < 0) {
            return;
        }
        if (numberStation > 9) {
            return;
        }
        this.numberStation = numberStation;
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
        if (currentVolume <= 100 && currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume <= 0) {
            currentVolume = 0;
        }
        if (currentVolume > 100) {
            currentVolume = 100;
        }
    }

    public void nextStation() {
        if (numberStation != 9) {
            numberStation = numberStation + 1;
        } else {
            numberStation = 0;
        }
    }

    public void prevStation() {
        if (numberStation != 0) {
            numberStation = numberStation - 1;
        } else {
            numberStation = 9;
        }


    }
}



