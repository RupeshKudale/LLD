package DesignPatterns.FactoryPattern;

import DesignPatterns.FactoryPattern.Shapes.Circle;
import DesignPatterns.FactoryPattern.Shapes.Shape;
import DesignPatterns.FactoryPattern.Shapes.Square;

public class ShapeFactory {
    public Shape getShape(String shape) {
        return switch (shape) {
            case "Square" -> new Square();
            case "Circle" -> new Circle();
            default -> null;
        };
    }
}
