package com.tecdesoftware.donut_app_backend;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DonutAppBackendApplicationTests {

	@Test
	void contextLoads() {
		try {
			System.out.println("[DEBUG_LOG] Context loaded successfully");
		} catch (Exception e) {
			System.out.println("[DEBUG_LOG] Error loading context: " + e.getMessage());
			e.printStackTrace();
		}
	}

}
