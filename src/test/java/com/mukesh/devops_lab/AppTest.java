package com.mukesh.devops_lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AppTest {

    @Test
    void sanity() {
        assertTrue(true);
    }

    @Test
    void addsNumbers() {
        assertEquals(5, App.add(2, 3));
    }
}
