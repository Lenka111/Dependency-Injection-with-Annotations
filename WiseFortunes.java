package com.practiceActivity;

import org.springframework.stereotype.Component;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

@Component
public class WiseFortunes implements FortuneTeller {
    String word = null;
    String [] fortuneArray;
    List<String> listOfFortunes = new ArrayList<>();
    final Random rand = new Random();

    {
        try {

            FileReader fileReader = new FileReader("src/com/practiceActivity/fortunes");
            BufferedReader bf = new BufferedReader(fileReader);
            while ((word = bf.readLine()) != null) {
                listOfFortunes.add(word);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getFortune() {
        //pick a random fortune from the array
        //load the fortunes into the array
        String [] fortuneArray = listOfFortunes.toArray(new String[0]);

        int index = rand.nextInt(fortuneArray.length);
        return fortuneArray[index];

    }
}
