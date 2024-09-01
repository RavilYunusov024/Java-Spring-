package com.example.new_Mook.Controller;

import java.util.Random;

public class GeneratorNewMook {
    public static int getRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(min, max);
    }
}
