package shapes;

import Main.Turtle;

import java.awt.*;

public class Square extends Shape {

    public Square(Turtle turtle, Point location, Color color, int border) {
        super(turtle, location, color, border);
    }

    @Override
    public void paint() {
        turtle.setPenWidth(3);
        turtle.setColor(color);
        turtle.penUp();
        turtle.goTo(0,0);
        turtle.penDown();
        turtle.forward();
        turtle.turnLeft(90);
        turtle.forward();
        turtle.turnLeft(90);
        turtle.forward();
        turtle.turnLeft(90);
        turtle.forward();




    }
}
