package com.demo.demo.Ref;

public class B {
    @Override
    public String toString() {
        return "B{" +
                "y=" + y +
                '}';
    }

    private int y;


    public B() {
        super();
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public B(int y) {
        this.y = y;
    }
}
