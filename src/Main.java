//Scrivere un programma che contenga una classe astratta chiamata
//Forma ed un metodo astratto chiamato calcolaArea().
//Crea poi due sottoclassi Rettangolo e Triangolo che estendono
//Forma ed implementano il metodo per il calcolo dell'area in maniera specifica.

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5, 10);
        double areaRectangle = rectangle.calculateArea();
        System.out.println("Area del Rettangolo: " + areaRectangle);

        Triangle triangle = new Triangle(3, 6);
        double areaTriangle = triangle.calculateArea();
        System.out.println("Area del triangolo: " + areaTriangle);
    }
}
