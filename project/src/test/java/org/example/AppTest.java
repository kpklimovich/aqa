package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    public void testFactorial() {
        Assertions.assertEquals(App.factorial(5), 120);
    }
}
