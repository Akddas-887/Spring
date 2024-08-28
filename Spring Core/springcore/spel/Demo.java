package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
    @Value("#{11+22}")
    private int x;
    @Value("#{11+44}")
    private int y;

    @Value("#{T(java.lang.Math).E}")
    private int e;

    @Value("#{T(java.lang.Math).sqrt(25)}")
    private int z;
    @Value("#{8>3}")
    private boolean isActive;


    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "x=" + x +
                ", y=" + y +
                ", e=" + e +
                ", z=" + z +
                ", isActive=" + isActive +
                '}';
    }

    public int getE() {
        return e;
    }

    public void setE(int e) {
        this.e = e;
    }

    public Demo(int x, int y, int e, int z) {
        this.x = x;
        this.y = y;
        this.e = e;
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public Demo() {
        super();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
