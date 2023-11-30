package io.joo.di.greet;

import io.joo.di.repository.GreetRepository;

public class EveningGreet implements GreetRepository {
    @Override
    public void greeting(){
        System.out.println("저녁입니다.");
    }
}
