package fh.java.geometry.model.threeDim;

import fh.java.geometry.model.ThreeDimShape;

/**
 * Created by Sony on 13.11.2016.
 */
public class SixSidedPrism extends ThreeDimShape {

    private double sideA;
    private double height;

    public SixSidedPrism() {
    }

    public SixSidedPrism(double sideA, double height) {
        this.sideA = sideA;
        this.height = height;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "SixSidedPrism{" +
                "sideA=" + sideA +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        SixSidedPrism that = (SixSidedPrism) o;

        if (Double.compare(that.sideA, sideA) != 0) return false;
        return Double.compare(that.height, height) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(sideA);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public double calcVolume() {
        return ((3/2)*(sideA*sideA)*Math.sqrt(3))*height;
    }

    @Override
    public double calcSurfaceArea() {
        return (2*((3/2)*(sideA*sideA)*Math.sqrt(3)))+((6 * sideA)*height);
    }
}
