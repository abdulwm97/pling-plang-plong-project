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
}
