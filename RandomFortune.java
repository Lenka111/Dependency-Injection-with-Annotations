package com.practiceActivity;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortune implements FortuneTeller {

    //create an array of fortunes
    String [] fortunes = {"Sleep more", "Exercise is the key", "Balanced diet is what you need"};

    //create a new random object
    private final Random rand = new Random();



    @Override
    public String getFortune() {
        //pick a random fortune from the array
        int index = rand.nextInt(fortunes.length);
        return fortunes[index];
    }
}
