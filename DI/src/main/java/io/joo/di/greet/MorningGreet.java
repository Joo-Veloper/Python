package io.joo.di.greet;

import io.joo.di.repository.GreetRepository;
import org.springframework.stereotype.Component;

@Component
public class MorningGreet implements GreetRepository {
    @Override
    public void greeting(){
        System.out.println("아침입니다.");
    }
}
