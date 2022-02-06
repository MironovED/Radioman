package ru.netology;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int maxAmountRadiStation = 10;

    public Radio() {
    }

    public Radio(int maxAmountRadiStation) {
        this.maxAmountRadiStation = maxAmountRadiStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxAmountRadiStation-1) {
            return;
        }
        if (currentRadioStation < 0) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void next() {
        if (currentRadioStation < maxAmountRadiStation-1) {
            this.currentRadioStation = currentRadioStation + 1;
        } else {
            this.currentRadioStation = 0;
        }
    }

    public void prev() {
        if (currentRadioStation > 0) {
            this.currentRadioStation = currentRadioStation - 1;
        } else {
            this.currentRadioStation = maxAmountRadiStation-1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 100;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
    }

}
