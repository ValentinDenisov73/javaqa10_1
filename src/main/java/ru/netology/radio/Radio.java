package ru.netology.radio;

public class Radio {

    private int currentRadioStation;
    private int minRadioStation;
    private int amountRadioStation = 10;
    private int maxRadioStation = amountRadioStation - 1;
    private int currentVolume;
    private int minVolume;
    private int maxVolume = 100;

    public Radio() {
        amountRadioStation = 10;
    }

    public Radio(int amountRadioStation) {
        this.maxRadioStation = amountRadioStation - 1;
    }

    public int getAmountRadioStation() {
        return amountRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > maxRadioStation) {
            return;
        }
        if (newCurrentRadioStation < minRadioStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void prevRadioStation() {
        if (currentRadioStation == minRadioStation) {
            currentRadioStation = maxRadioStation;
            return;
        }
        currentRadioStation--;
    }

    public void nextRadioStation() {
        if (currentRadioStation == maxRadioStation) {
            currentRadioStation = minRadioStation;
            return;
        }
        currentRadioStation++;
    }


    public int getVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume == maxVolume) {
            currentVolume = currentVolume;
        }
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void reduceVolume() {
        if (currentVolume == minVolume) {
            currentVolume = currentVolume;
        }
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }

}
