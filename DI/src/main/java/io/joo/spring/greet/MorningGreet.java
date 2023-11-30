package io.joo.spring.greet;

import io.joo.spring.repository.GreetRepository;
import org.springframework.stereotype.Component;

@Component
public class MorningGreet implements GreetRepository {
    @Override
    public void greeting(){
        System.out.println("아침입니다.");
    }
}
