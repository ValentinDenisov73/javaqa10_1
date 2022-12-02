package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    void shouldSetAmountRadioStationAsDefault() {
        Radio radio = new Radio();
        int expected = 10;
        Assertions.assertEquals(expected, radio.getAmountRadioStation());
    }

    @Test
    void shouldSetCurrentRadioStation() {
        Radio radio = new Radio(30);
        radio.setCurrentRadioStation(15);
        int expected = 15;
        Assertions.assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void shouldChangeOnMaxRadioStationIfStationMin() {
        Radio radio = new Radio(30);
        radio.setCurrentRadioStation(0);
        radio.prevRadioStation();
        int expected = 29;
        Assertions.assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void shouldChangeOnMinRadioStationIfStationMax() {
        Radio radio = new Radio(30);
        radio.setCurrentRadioStation(29);
        radio.nextRadioStation();
        int expected = 0;
        Assertions.assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void shouldChangePrevRadioStation() {
        Radio radio = new Radio(30);
        radio.setCurrentRadioStation(1);
        radio.prevRadioStation();
        int expected = 0;
        Assertions.assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void shouldChangeNextRadioStation() {
        Radio radio = new Radio(30);
        radio.setCurrentRadioStation(8);
        radio.nextRadioStation();
        int expected = 9;
        Assertions.assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSetCurrentRadioStationIfStationLessMin() {
        Radio radio = new Radio(30);
        radio.setCurrentRadioStation(-1);
        int expected = 0;
        Assertions.assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSetCurrentRadioStationIfStationAboveMax() {
        Radio radio = new Radio(30);
        radio.setCurrentRadioStation(30);
        int expected = 0;
        Assertions.assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void shouldNotChangeVolumeIfVolumeMax() {
        Radio radio = new Radio(10);
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        Assertions.assertEquals(expected, radio.getVolume());
    }

    @Test
    void shouldNotChangeVolumeIfVolumeMin() {
        Radio radio = new Radio(10);
        radio.setCurrentVolume(0);
        radio.reduceVolume();
        int expected = 0;
        Assertions.assertEquals(expected, radio.getVolume());
    }

    @Test
    void volumeIncrease() {
        Radio radio = new Radio(10);
        radio.setCurrentVolume(8);
        radio.increaseVolume();
        int expected = 9;
        Assertions.assertEquals(expected, radio.getVolume());
    }

    @Test
    void volumeReduce() {
        Radio radio = new Radio(10);
        radio.setCurrentVolume(9);
        radio.reduceVolume();
        int expected = 8;
        Assertions.assertEquals(expected, radio.getVolume());
    }

    @Test
    void shouldSetVolumeIfVolumeAboveMax() {
        Radio radio = new Radio(10);
        radio.setCurrentVolume(101);
        int expected = 0;
        Assertions.assertEquals(expected, radio.getVolume());
    }

    @Test
    void shouldSetVolumeIfVolumeLessMin() {
        Radio radio = new Radio(10);
        radio.setCurrentVolume(-1);
        int expected = 0;
        Assertions.assertEquals(expected, radio.getVolume());
    }

}
