package com.learn.cicd;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HelloServiceTest {

	private final HelloService helloService = new HelloService();

	@Test
	void helloReturnsGreetingMessage() {
		String message = helloService.hello();

		assertThat(message).isEqualTo("Hello World!");
	}
}
