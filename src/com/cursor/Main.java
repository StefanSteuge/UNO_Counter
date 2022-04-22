package com.cursor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Greeting greeting = new Greeting(0, 0);
        Counter counter = new Counter(0, 0);

        int sum = scanner.nextInt();
        counter.sum(counter.getA()+ counter.getB());
        while (sum > 500) {
            System.out.println("Вітаю, ти першим завершив забіг :)))");
        }
    }
}
