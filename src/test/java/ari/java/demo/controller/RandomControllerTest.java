package ari.java.demo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class RandomControllerTest {

    @Autowired
    private RandomController randomController;

    @Test
    public void randomString() {
        assertNotNull(randomController.randomString(), "La chaîne est nulle.");
        assertEquals(10, randomController.randomString().length(), "La chaîne doit avoir 10 caractères.");
    }

    @Test
    public void randomNumber() {
        assertNotEquals(0, randomController.randomNumber(), "L'entier ne doit pas valoir 0.");
    }
}