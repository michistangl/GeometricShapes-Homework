package fh.java.geometry;

import fh.java.geometry.model.GeometricShape;
import fh.java.geometry.model.ThreeDimShape;
import fh.java.geometry.model.curved.Circle;
import fh.java.geometry.model.polygons.Hexagon;
import fh.java.geometry.model.quadrilateral.Rectangle;
import fh.java.geometry.model.quadrilateral.Trapez;
import fh.java.geometry.model.threeDim.Cuboid;
import fh.java.geometry.model.threeDim.QuadraticPyramid;
import fh.java.geometry.model.threeDim.SixSidedPrism;
import fh.java.geometry.model.trilateral.RightTriangle;
import fh.java.geometry.model.trilateral.Triangle;


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

        /*
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
        */

        //Homework
        List<GeometricShape> twoDimList = new ArrayList();
        List<ThreeDimShape> threeDimList =  new ArrayList();

        fillList(twoDimList);
        fillListThreeDim(threeDimList);

        printSum(twoDimList);
        printSumThreeDim(threeDimList);

    }


    public void fillList(List<GeometricShape> shapeList) {
		//TODO: Implement
        /*
        shapeList.add(new Circle(1,2,3.0));
        shapeList.add(new Circle(1,3,3.1));
        shapeList.add(new Circle(4,2,3.2));
        shapeList.add(new Circle(1,4,3.5));

        shapeList.add(new Rectangle(3,4,5.0,2.0));
        shapeList.add(new Rectangle(11,4,33.0,2.0));
        shapeList.add(new Rectangle(3,14,22.0,1.0));
        shapeList.add(new Rectangle(3,34,5.0,4.3));

        shapeList.add(new RightTriangle(55,44,3.3,4.4));
        */

        // Homework
        shapeList.add(new Trapez(6,3,16,9,3));
        shapeList.add(new Trapez(5,4,3,4.15,4));
        shapeList.add(new Trapez(8,4,3,5.84,4));

        shapeList.add(new Hexagon(3));
        shapeList.add(new Hexagon(4));
        shapeList.add(new Hexagon(5));

        shapeList.add(new Triangle(4));
        shapeList.add(new Triangle(3));
        shapeList.add(new Triangle(2));

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

    public void fillListThreeDim(List<ThreeDimShape> threeDimList) {
        threeDimList.add(new Cuboid(3,4,5));
        threeDimList.add(new Cuboid(3,5,5));
        threeDimList.add(new Cuboid(5,5,5));

        threeDimList.add(new SixSidedPrism(4,5));
        threeDimList.add(new SixSidedPrism(4,6));
        threeDimList.add(new SixSidedPrism(5,5));


        threeDimList.add(new QuadraticPyramid(4,4,4));
        threeDimList.add(new QuadraticPyramid(4,5,4));
        threeDimList.add(new QuadraticPyramid(3,4,4));

    }

    public void printSum(List<GeometricShape> twoDimList) {
        double areaSum = 0;
        double perimeterSum = 0;
        for (GeometricShape geometricShape : twoDimList) {
            areaSum = areaSum + geometricShape.calcArea();
            perimeterSum = perimeterSum + geometricShape.calcPerimeter();
        }
        System.out.println("2-dimensional");
        System.out.println("Sum of areas: " + areaSum);
        System.out.println("Sum of perimeters: " + perimeterSum);
    }

    public void printSumThreeDim(List<ThreeDimShape> threeDimList) {
        double volumeSum = 0;
        double surfaceSum = 0;
        for (ThreeDimShape threeDimShape : threeDimList) {
            volumeSum = volumeSum + threeDimShape.calcVolume();
            surfaceSum = surfaceSum + threeDimShape.calcSurfaceArea();
        }
        System.out.println("\n3-dimensional");
        System.out.println("Sum of volumes: " + volumeSum);
        System.out.println("Sum of surface areas: " + surfaceSum);
    }

}
