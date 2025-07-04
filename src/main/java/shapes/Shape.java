package shapes;


import Main.Turtle;

import java.awt.*;

public abstract class Shape {

protected Turtle turtle;

protected Point location;

protected Color color;

protected int border;


    public Shape(Turtle turtle, Point location, Color color, int border) {
        this.turtle = turtle;
        this.location = location;
        this.color = color;
        this.border = border;
    }

    public Turtle getTurtle() {
        return turtle;
    }

    public void setTurtle(Turtle turtle) {
        this.turtle = turtle;
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getBorder() {
        return border;
    }

    public void setBorder(int border) {
        this.border = border;
    }

    public abstract void paint();


    @Override
    public String toString() {
        return turtle + "|" + location + "|" + color + "|" + border;
    }
}



