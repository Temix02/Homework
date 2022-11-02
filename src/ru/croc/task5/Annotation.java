package ru.croc.task5;

public class Annotation {

    private String inscription;
    private Figure figure;

    public Annotation() {
        figure = new Figure();
        inscription = "";
    }

    Annotation(Figure figure, String inscription) {
        this.inscription = inscription;
        this.figure = figure;
    }

    public Figure getFigure() {
        return figure;
    }

    public void setFigure(Figure figure) {
        this.figure = figure;
    }

    public String getInscription() {
        return inscription;
    }

    public void setInscription(String inscription) {
        this.inscription = inscription;
    }
    public String toString() {
        return figure.toString() + " " + inscription;
    }

}
