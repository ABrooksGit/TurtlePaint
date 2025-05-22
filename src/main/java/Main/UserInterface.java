package Main;

import Main.console.Console;
import shapes.*;

import java.awt.*;

public class UserInterface {
    private Console console = new Console();

    private  final  World world = new World(200,200);
    private final Turtle turtle = new Turtle(world, -100, -100);
    private final Point point = new Point(100,100);



    public void HomeScreen(){

    String prompt = """
                Welcome To Turtle Paint!:\s
                 1 - Add a shape\s
                 2 - Save the image \s
                 0 - Quit
                Enter your command(number 1-2):\s""";

        int options;

        do{

            options = console.promptForInt(prompt);
            switch (options){
                case 1: addShape();
                break;
                case 2: saveImage();
                break;
                default:
                    break;

            }


        } while (options != 0);




    }

    private void addShape() {

        int addShape;

        do {
            System.out.println("1.Square");
            System.out.println("2.X");
            System.out.println("3.Triangle");
            addShape = console.promptForInt("Which shape do you want to add: ");


            switch (addShape){
                case 1:
                    System.out.println("Square");
                    square();
                    continue;
                case 2:
                    System.out.println("X");
                    X();
                   continue;
                case 3:
                    System.out.println("Triangle");
                    triangle();
                    break;

                case 4:
                    System.out.println("Circle");
                    circle();
                    break;
                default :
                    break;

            }



        } while (addShape != 0);


    }




    public  void X(){

        String colorName = console.promptForColor("What is the border color: ");
        Color borderColor = console.getColor(colorName);

        int borderWidth = console.promptForInt("What is the border width?: ");

        // Creates an X
        X x = new X(turtle, point, borderColor, borderWidth);
        x.paint();



    }

    public  void circle() {

        int circleRadius = console.promptForInt("What is the radius?: ");

        String colorName = console.promptForColor("What is the border color: ");
        Color borderColor = console.getColor(colorName);

        int borderWidth = console.promptForInt("What is the border width?: ");

        //Creates a Circle
        Circle circle = new Circle(turtle,point,borderColor,borderWidth,circleRadius);
        circle.paint();

    }


    public void hexagon() {

        String colorName = console.promptForColor("What is the border color: ");
        Color borderColor = console.getColor(colorName);

        int borderWidth = console.promptForInt("What is the border width?: ");

        //Creates a Hexagon
        Hexagon hexagon = new Hexagon(turtle,point,borderColor,borderWidth);
        hexagon.paint();
    }


    public void square() {
        String colorName = console.promptForColor("What is the border color: ");
        Color borderColor = console.getColor(colorName);

//        Color borderColor = Color.getColor(console.promptForString("What is the border color: "));
        int borderWidth = console.promptForInt("What is the border width?: ");

        //Creates a Square
        Square square = new Square(turtle,point, borderColor,borderWidth);
        square.paint();
    }

    public  void triangle() {

        String colorName = console.promptForColor("What is the border color: ");
        Color borderColor = console.getColor(colorName);

        int borderWidth = console.promptForInt("What is the border width?: ");

        //Creates a Triangle
        Triangle triangle = new Triangle(turtle,point,borderColor,borderWidth);
        triangle.paint();
    }
















    private  void saveImage() {
    }








}
