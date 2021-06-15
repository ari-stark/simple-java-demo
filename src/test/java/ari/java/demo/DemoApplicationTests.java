package ari.java.demo;

import ari.java.demo.controller.RandomController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	public RandomController randomController;

	@Test
	void contextLoads() {
		assertNotNull(randomController);
	}

}
