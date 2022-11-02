package ru.croc.task5;

public class Figure {

    protected String Figures;

    public Figure() {
        this.Figures = "";
    }

    public String getFigures() {
        return Figures;
    }

    public void setFigures(String Figures) {
        this.Figures = Figures;
    }

    public String toString() {
        return Figures + " Empty Figure";
    }

}
