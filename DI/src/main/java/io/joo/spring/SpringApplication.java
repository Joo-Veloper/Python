package io.joo.spring;

import io.joo.spring.repository.GreetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringApplication {
	public static void main(String[] args) {
		org.springframework.boot.SpringApplication.run(SpringApplication.class, args)
				.getBean(SpringApplication.class).execute();
	}

	@Autowired
	GreetRepository greetRepository;
	private void execute() {
		greetRepository.greeting();
	}


}
