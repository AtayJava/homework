package com.company;

public class Runner implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Runner " + i + " берет палку");
            System.out.println("Runner " + i + " бежит к Runner " + i);


        }
    }
}
