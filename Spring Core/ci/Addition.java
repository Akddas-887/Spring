package com.demo.demo.ci;

public class Addition {
    private int a;
    private int b;

    public Addition(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Int");
    }

    public Addition(double a, double b) {
        this.a = (int)a;
        this.b = (int)b;
        System.out.println("Double");
    }

    public Addition(String a, String b) {
        this.a = Integer.parseInt(a);
        this.b = Integer.parseInt(b);
        System.out.println("String");
    }

    public Addition() {
        super();
    }

    @Override
    public String toString() {
        return "Addition{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
