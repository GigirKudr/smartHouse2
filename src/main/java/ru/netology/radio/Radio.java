package ru.netology.radio;

public class Radio {
    private int numberStation;
    private int currentVolume;
    private int maxStation;

    public Radio(int stationsCount) {
        this.maxStation = stationsCount - 1;
    }

    public Radio() {
        this.maxStation = 9;

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

    public void setStation(int numberStation) {
        if (numberStation < 0) {
            return;
        }
        if (numberStation > maxStation) {
            return;
        }
        this.numberStation = numberStation;
    }


    public void increaseVolume() {
        if (currentVolume != 100) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 100;
        }
    }


    public void decreaseVolume() {
        if (currentVolume != 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
    }


    public void nextStation() {
        if (numberStation != maxStation) {
            numberStation++;
        } else {
            numberStation = 0;
        }
    }

    public void prevStation() {
        if (numberStation != 0) {
            numberStation--;
        } else {
            numberStation = maxStation;
        }
    }
}



