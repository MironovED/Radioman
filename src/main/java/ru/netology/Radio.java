package ru.netology;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;


    public int getCurrentRadioStation() {       //ready
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {       //ready
        if (currentRadioStation > 9) {
            return;
        }
        if (currentRadioStation < 0) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void next() {
        if (currentRadioStation < 9) {
            this.currentRadioStation = currentRadioStation + 1;
        } else {
            this.currentRadioStation = 0;
        }
    }

    public void prev() {
        if (currentRadioStation > 0) {
            this.currentRadioStation = currentRadioStation - 1;
        } else {
            this.currentRadioStation = 9;
        }
    }

    public int getCurrentVolume() {         //ready
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {       //ready
        if (currentVolume > 10) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {          //ready
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {            //ready
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

}
