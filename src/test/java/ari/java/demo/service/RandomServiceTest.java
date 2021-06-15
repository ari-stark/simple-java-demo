package ari.java.demo.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class RandomServiceTest {

    @Autowired
    private RandomService randomService;

    @Test
    void randomString() {
        assertNotNull(randomService.randomString(), "La chaîne est nulle.");
        assertEquals(10, randomService.randomString().length(), "La chaîne doit avoir 10 caractères.");
    }

    @Test
    void randomInt() {
        assertNotEquals(0, randomService.randomInt(), "L'entier ne doit pas valoir 0.");
    }
}