package com.practiceActivity;

import org.springframework.stereotype.Component;

@Component
public class HappyFortune implements FortuneTeller {

    @Override
    public String getFortune() {
        return "Today is your lucky day";
    }
}
