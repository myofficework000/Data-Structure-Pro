package com.example.googlepreperation.thread;

class PrintNumbers {

    int counter = 1;

    public void printOddNumber(int number) {
        synchronized (this) {
            while (counter < number) {

                while (number % 2 == 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println(counter + " ");
                counter++;
                notify();
            }
        }
    }

    public void printEvenNumber(int number) {
        synchronized (this) {
            while (counter < number) {

                while (number % 2 == 1) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println(counter + " ");
                counter++;
                notify();
            }
        }
    }


    public static void main(String[] args) {
        PrintNumber object = new PrintNumber();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                object.printOddNumber(20);
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                object.printEvenNumber(20);
            }
        });

        t1.start();
        t2.start();
    }
}

