package ShapeFileManager;
import Main.Turtle;
import shapes.Shape;

import java.awt.*;
import java.io.*;
import java.util.regex.Pattern;


public class ShapeFileManager {

private static String fileName = "painting.csv";

    public ShapeFileManager(String fileName) {
        ShapeFileManager.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        ShapeFileManager.fileName = fileName;
    }

//
//    public Shape getShape(){
//
//        Shape shape = null;
//
//        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
//
//            String shapeReader = br.readLine();
//
//            if (shapeReader != null){
//                shape =
//            }
//        }
//
//
//
//
//
//
//    }



//    public Shape getshapefromEncodedString(String encodedString){
//        String[] shapeParts = encodedString.split(Pattern.quote("|"));
//
//
//
//
//    }


    public static void saveShape(Shape shape){
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));

            bw.write(shape.toString());

            bw.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }



}
