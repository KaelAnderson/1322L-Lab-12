package com.company;

import java.util.Random;

public class Baby implements Runnable{
    int time;
    Random rand = new Random();


    String name;
    Baby(String inputName){
        name = inputName;
        time = rand.nextInt(5000);
    }

    @Override
    public void run() {
        try {
            System.out.println("My name is " + name + " I am going to sleep for " + time + "ms");
            Thread.sleep(time);
            System.out.println("My name is " + name + ", I am awake, feed me!!!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
