package ru.croc.task5;

public class Circle extends Figure {

    private int x;
    private int y;
    private int r;

    public Circle() {
        this.x = 0;
        this.y = 0;
        this.r = 0;
        this.Figures = "C";
    }

    public Circle(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.Figures = "C";
    }

    public int getx() {
        return x;
    }

    public void setx(int x) {
        this.x = x;
    }

    public int gety() {
        return y;
    }

    public void sety(int y) {
        this.y = y;
    }

    public int getr() {
        return r;
    }

    public void setr(int r) {
        this.r = r;
    }

    public String toString() {
        return Figures + " (" + x + ", " + y + "), " + r + ":";
    }
}
