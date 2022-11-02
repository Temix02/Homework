package ru.croc.task5;

public class Rectangle extends Figure {

    private int LeftX;
    private int RightX;
    private int BottomY;
    private int UpperY;

    public Rectangle() {
        this.LeftX = 0;
        this.RightX = 0;
        this.BottomY = 0;
        this.UpperY = 0;
        this.Figures = "R";
    }

    public Rectangle(int LeftX, int RightX, int BottomY, int UpperY) {
        this.LeftX = LeftX;
        this.RightX = RightX;
        this.BottomY = BottomY;
        this.UpperY = UpperY;
        this.Figures = "R";
    }

    public int getLeftX() {
        return LeftX;
    }

    public void setLeftX(int LeftX) {
        this.LeftX = LeftX;
    }

    public int getRightX() {
        return RightX;
    }

    public void setRightX(int RightX) {
        this.RightX = RightX;
    }

    public int getBottomY() {
        return BottomY;
    }

    public void setBottomY(int BottomY) {
        this.BottomY = BottomY;
    }

    public int getUpperY() {
        return UpperY;
    }

    public void setUpperY(int UpperY) {
        this.UpperY = UpperY;
    }
    public String toString() {
        return Figures + " (" + LeftX + ", " + BottomY + "), " + " (" + RightX + ", " + UpperY + "):";
    }
}
