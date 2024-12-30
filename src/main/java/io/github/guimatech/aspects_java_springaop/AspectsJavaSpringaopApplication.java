package io.github.guimatech.aspects_java_springaop;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.github.guimatech.aspects_java_springaop.dummy.DummyService;
import io.github.guimatech.aspects_java_springaop.hello.HelloService;

@SpringBootApplication
public class AspectsJavaSpringaopApplication {

	public static void main(String[] args) {
		SpringApplication.run(AspectsJavaSpringaopApplication.class, args);
	}

	@Bean
	ApplicationRunner runner(HelloService helloService, DummyService dummyService) {
		return args -> {
			helloService.hello();
			dummyService.dummy();
		};
	}

}
