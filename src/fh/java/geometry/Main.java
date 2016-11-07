package fh.java.geometry;

import fh.java.geometry.model.GeometricShape;
import fh.java.geometry.model.curved.Circle;
import fh.java.geometry.model.quadrilateral.Rectangle;
import fh.java.geometry.model.trilateral.RightTriangle;


import java.util.*;
import java.util.stream.Collectors;

public class Main {
		//TODO: main() is missing

    public static void main(String[] args) {
        // static = really there, but belongs to class
        // non-static method can not be referenced from static method

        Main main = new Main();

        main.doIt(); //Alt+Enter for implementing method

    }

    private void doIt() {

        // bad:
        // ArrayList shapeListBad = new ArrayList(); --> accepts ALL objects, you don't know what you get out

        // better:
        // ArrayList<GeometricShape> shapeListBad = new ArrayList(); --> only GeometricShape-Objects possbile

        // best:
        List<GeometricShape> shapeList = new ArrayList();   // create real class, but look at it as abstract object

        fillList(shapeList);
        printList(shapeList);

        List<Circle> circleList = new ArrayList();

        for (GeometricShape shape : shapeList) {
            if(shape instanceof Circle) {
                circleList.add((Circle) shape);     // (Circle) = casting
            }
        }

        System.out.println("-----------------------------------------------");
        for (Circle circle : circleList) {
            System.out.println(circle);
        }

    }


    public void fillList(List<GeometricShape> shapeList) {
		//TODO: Implement

        shapeList.add(new Circle(1,2,3.0));
        shapeList.add(new Circle(1,3,3.1));
        shapeList.add(new Circle(4,2,3.2));
        shapeList.add(new Circle(1,4,3.5));

        shapeList.add(new Rectangle(3,4,5.0,2.0));
        shapeList.add(new Rectangle(11,4,33.0,2.0));
        shapeList.add(new Rectangle(3,14,22.0,1.0));
        shapeList.add(new Rectangle(3,34,5.0,4.3));

        shapeList.add(new RightTriangle(55,44,3.3,4.4));

    }


    public void printList(List<GeometricShape> shapeList) {
		//TODO: Implement

        // bad
        System.out.println("--------for--------");
        // fori schreiben + Enter
        for (int pos = 0; pos < shapeList.size(); pos++){
            System.out.println(shapeList.get(pos));
        }

        // better
        System.out.println("--------for each--------");
        // iter schreiben + Enter
        for (GeometricShape geometricShape : shapeList) {
            System.out.println(geometricShape);
        }

        // best
        System.out.println("--------stream 1--------");
        shapeList.stream()
                .forEach(shape -> System.out.println(shape));

        System.out.println("--------stream 2--------");
        shapeList.stream()
                .forEach(System.out::println);

    }


}
