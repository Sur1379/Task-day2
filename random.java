package com.company.TaskDay2;


import java.util.concurrent.ThreadLocalRandom;

public class random {
    public static void main(String[] args) {
       int randomNum = ThreadLocalRandom.current().nextInt(700,1500);
          System.out.println(randomNum);
    }
}
