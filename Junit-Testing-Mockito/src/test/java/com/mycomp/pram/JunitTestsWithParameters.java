package com.mycomp.pram;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class JunitTestsWithParameters {
	@ParameterizedTest(name = "#{index} - Run test with args={0}")
    @ValueSource(strings = {"apple", "banana", "papaya"})
    void test_int_arrays_custom_name(String arg) {
        assertTrue(arg.length() > 0);
    }
}
