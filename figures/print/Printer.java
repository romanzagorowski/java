package print;

import java.util.List;
import model.Figure;

public class Printer {

    public static void printArea(Figure figure) {
        System.out.println("The method getArea() of " + figure.toString() + " has returned " + figure.getArea());
    }

    public static void printArea(List<? extends Figure> figures) {

        for(Figure figure : figures) {
            Printer.printArea(figure);
        }
    }
}

