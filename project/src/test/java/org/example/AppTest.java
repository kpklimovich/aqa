package org.example;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class AppTest {
    @Test
    public void testFactorial() {
        assertEquals(App.factorial(5), 120);
    }
}
