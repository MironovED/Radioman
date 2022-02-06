package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void nextRadioStationSinceTheLastToTheFirst() {
        Radio radio = new Radio(2);
        radio.setCurrentRadioStation(1);
        radio.next();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void nextRadioStationSinceTheFirstToTheLast() {
        Radio radio = new Radio(16);
        radio.setCurrentRadioStation(0);
        radio.prev();

        int expected = 15;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void prevRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.prev();

        int expected = 8;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void nextRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.next();

        int expected = 1;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

        @Test
    void setRadioStationNumber11() {
        Radio radio = new Radio(11);
        radio.setCurrentRadioStation(11);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void setRadioStationNumber9() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);

        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentRadioStationNumber0() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentRadioStationNumber1() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);

        int expected = 1;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentRadioStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }
///////         //////  ////    /////
    @Test
    void increaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeToMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    void reduceVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.reduceVolume();

        int actual = radio.getCurrentVolume();
        int expected = 99;
        assertEquals(expected, actual);
    }

    @Test
    void reduceVolumeToMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.reduceVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

//    @Test
//    void setCurrentVolume11() {
//        Radio radio = new Radio();
//        radio.setCurrentVolume(11);
//
//        int actual = radio.getCurrentVolume();
//        int expected = 0;
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    void setCurrentVolume_1() {
//        Radio radio = new Radio();
//        radio.setCurrentVolume(-1);
//
//        int actual = radio.getCurrentVolume();
//        int expected = 0;
//        assertEquals(expected, actual);
//    }

}