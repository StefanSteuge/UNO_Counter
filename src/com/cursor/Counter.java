package com.cursor;

public class Counter {
    private int a, b;
    public int sum = 0;

    public Counter(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int sum(int i) {
        while (sum == 300 || sum > 300) {
            System.out.println("О, ти круто піднявся");
        }
        return a + b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }
}
