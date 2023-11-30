package io.joo.spring.greet;

import io.joo.spring.repository.GreetRepository;

public class EveningGreet implements GreetRepository {
    @Override
    public void greeting(){
        System.out.println("저녁입니다.");
    }
}
