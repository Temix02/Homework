package ru.croc.task5;

public class Test {

    public static void main(String[] args) {

        Annotation[] annotations = new Annotation[2];
        Figure figure1 = new Circle(1, 2, 3);
        Annotation annotation1 = new Annotation(figure1, "Circle");
        annotations[0] = annotation1;
        Figure figure2 = new Rectangle(8, 7, 6, 5);
        Annotation annotation2 = new Annotation(figure2, "Rectangle");
        annotations[1] = annotation2;
        AnnotatedImage annotatedImage = new AnnotatedImage("Path", annotations);
        annotatedImage.printAnnotations();

    }

}
