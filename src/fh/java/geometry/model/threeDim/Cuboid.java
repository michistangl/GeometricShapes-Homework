package fh.java.geometry.model.threeDim;

import fh.java.geometry.model.ThreeDimShape;

/**
 * Created by Sony on 13.11.2016.
 */
public class Cuboid extends ThreeDimShape {

    private double sideA;
    private double sideB;
    private double sideC;

    public Cuboid() {
    }

    public Cuboid(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    @Override
    public String toString() {
        return "Cuboid{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", height=" + sideC +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Cuboid cuboid = (Cuboid) o;

        if (Double.compare(cuboid.sideA, sideA) != 0) return false;
        if (Double.compare(cuboid.sideB, sideB) != 0) return false;
        return Double.compare(cuboid.sideC, sideC) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(sideA);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideB);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideC);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public double calcVolume() {
        return sideA*sideB*sideC;
    }

    @Override
    public double calcSurfaceArea() {
        return 2*(sideA*sideB+sideB*sideC+sideA*sideC);
    }
}
