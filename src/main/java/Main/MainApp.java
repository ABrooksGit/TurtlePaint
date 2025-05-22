package Main;

import shapes.*;

import java.awt.*;

public class MainApp
{
    private static  final  World world = new World(200,200);
    private static final Turtle turtle = new Turtle(world, -100, -100);
    private static final Point point = new Point(100,100);



    public static void main(String[] args) {

//        X();
//        square();
//        triangle();
//        UserInterface  UI = new UserInterface();
//
//        UI.HomeScreen();
//


    }
    public static void X(){

        // Creates an X
        X x = new X(turtle, point, Color.GREEN, 2);
        x.paint();



    }

//
//    public static void circle() {
//
//        //Creates a Circle
//
//        Circle circle = new Circle(turtle,point,Color.GREEN,2, );
//        circle.paint();
//
//    }
//
//
//    public static void hexagon() {
//
//        //Creates a Hexagon
//        Hexagon hexagon = new Hexagon(turtle,point,Color.GREEN,2);
//        hexagon.paint();
//    }
//
//
    public static void square() {
        //Creates a Square

        Square square = new Square(turtle,point,Color.GREEN,2);
        square.paint();
    }

    public static void triangle() {

        //Creates a Triangle

        Triangle triangle = new Triangle(turtle,point,Color.GREEN,2);
        triangle.paint();
    }


}
