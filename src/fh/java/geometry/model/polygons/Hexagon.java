package fh.java.geometry.model.polygons;

import fh.java.geometry.model.GeometricShape;

/**
 * Created by Sony on 13.11.2016.
 */
public class Hexagon extends GeometricShape{

    private double sideA;

    public Hexagon() {
    }

    public Hexagon(double sideA) {
        this.sideA = sideA;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    @Override
    public String toString() {
        return "Hexagon{" +
                "sideA=" + sideA +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Hexagon hexagon = (Hexagon) o;

        return Double.compare(hexagon.sideA, sideA) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(sideA);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public double calcArea() {
        return ((3/2)*(sideA*sideA)*Math.sqrt(3));
    }

    @Override
    public double calcPerimeter() {
        return 6 * sideA;
    }
}
