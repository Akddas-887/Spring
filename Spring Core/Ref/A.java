package com.demo.demo.Ref;

public class A {
    public A() {
        super();
    }

    @Override
    public String toString() {
        return "A{" +
                "x=" + x +
                ", obj=" + obj +
                '}';
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public B getObj() {
        return obj;
    }

    public void setObj(B obj) {
        this.obj = obj;
    }

    public A(int x, B obj) {
        this.x = x;
        this.obj = obj;
    }

    private int x;
    private B obj;

}
