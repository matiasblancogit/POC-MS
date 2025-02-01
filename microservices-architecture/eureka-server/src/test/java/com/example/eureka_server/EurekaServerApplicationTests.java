package com.example.eureka_server;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = {
    "eureka.client.enabled=false",
    "eureka.client.registerWithEureka=false",
    "eureka.client.fetchRegistry=false"
})
class EurekaServerApplicationTests {

	@Test
	void contextLoads() {
	}

}
