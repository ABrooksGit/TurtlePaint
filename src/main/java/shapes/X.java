package shapes;

import Main.Turtle;

import java.awt.*;

public class X extends Shape {

    public X(Turtle turtle, Point location, Color color, int border) {
        super(turtle, location, color, border);
    }

    @Override
    public void paint(){

        int width = 200;
        int height = 200;

        // calculate the hypotenuse (diagonal)
        // a2 + b2 = c2
        double widthSquared = Math.pow(width, 2);
        double heightSquared = Math.pow(height, 2);
        double hypotenuse = Math.sqrt(widthSquared + heightSquared);


        turtle.setPenWidth(3);
        turtle.setColor(color);
        turtle.turnRight(45);
        turtle.forward(hypotenuse);
        turtle.penUp();
        turtle.goTo(100, 100);
        turtle.turnRight(90);
        turtle.penDown();
        turtle.forward(hypotenuse);
    }


}



