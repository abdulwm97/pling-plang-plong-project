package com.sparta.abdul;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class UnitTests {
    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9, 12})
    @DisplayName("Testing for Pling")
    void testingForPling(int n) {
        Assertions.assertEquals("Pling", PlingPlangPlong.generatePlingPlangPlong(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 20, 25})
    @DisplayName("Testing for Plang")
    void testingForPlang(int n) {
        Assertions.assertEquals("Plang", PlingPlangPlong.generatePlingPlangPlong(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 30, 45, 60})
    @DisplayName("Testing for PlingPlang")
    void testingForPlingPlang(int n) {
        Assertions.assertEquals("PlingPlang", PlingPlangPlong.generatePlingPlangPlong(n));
    }


    @ParameterizedTest
    @ValueSource(ints = {7, 14, 28, 49})
    @DisplayName("Testing for Plong")
    void testingForPlong(int n) {
        Assertions.assertEquals("Plong", PlingPlangPlong.generatePlingPlangPlong(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {21, 42, 63, 84})
    @DisplayName("Testing for PlingPlong")
    void testingForPlingPlong(int n) {
        Assertions.assertEquals("PlingPlong", PlingPlangPlong.generatePlingPlangPlong(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {35, 70, 140, 175})
    @DisplayName("Testing for PlangPlong")
    void testingForPlangPlong(int n) {
        Assertions.assertEquals("PlangPlong", PlingPlangPlong.generatePlingPlangPlong(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {105, 210, 315})
    @DisplayName("Checking for PlingPlangPlong")
    void checkingForPlingPlangPlong(int n) {
        Assertions.assertEquals("PlingPlangPlong", PlingPlangPlong.generatePlingPlangPlong(n));
    }
}
