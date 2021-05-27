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
}
