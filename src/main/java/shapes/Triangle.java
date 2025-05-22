package shapes;

import Main.Turtle;

import java.awt.*;

public class Triangle extends Shape {


    public Triangle(Turtle turtle, Point location, Color color, int border) {
        super(turtle, location, color, border);


    }


    @Override
    public void paint() {

        turtle.setPenWidth(3);
        turtle.setColor(color);
        turtle.penUp();
        turtle.goTo(0,0);
        turtle.penDown();
        turtle.turnRight(45);
        turtle.forward();
        turtle.turnRight(0);
        turtle.forward();
        turtle.penUp();
        turtle.goTo(-100,-100);
        turtle.penDown();
        turtle.turnLeft(90);
        turtle.forward();
        turtle.goTo(0,0);
        turtle.penUp();
        turtle.goTo(-100,-100);
        turtle.penDown();
        turtle.turnRight(45);
        turtle.forward();
        turtle.forward();

    }

}
