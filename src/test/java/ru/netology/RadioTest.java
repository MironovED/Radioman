package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void setCurrentRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(15);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void nextRadioStation() {
        Radio radio = new Radio();
        radio.next(9);

        int actual = radio.getCurrentRadioStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void prevRadioStation() {
        Radio radio = new Radio();
        radio.prev(0);

        int actual = radio.getCurrentRadioStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void increaseVolume() {
        Radio radio = new Radio();
        radio.increaseVolume(10);


        int actual = radio.getCurrentVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    void reduceVolume() {
        Radio radio = new Radio();
        radio.reduceVolume(3);


        int actual = radio.getCurrentVolume();
        int expected = 2;
        assertEquals(expected, actual);
    }

}