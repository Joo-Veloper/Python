package io.joo.di;

import io.joo.di.repository.GreetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DiApplication {
	public static void main(String[] args) {
		SpringApplication.run(DiApplication.class, args)
				.getBean(DiApplication.class).execute();
	}

	@Autowired
	GreetRepository greetRepository;
	private void execute() {
		greetRepository.greeting();
	}


}
