package fh.java.geometry.model.threeDim;

import fh.java.geometry.model.ThreeDimShape;

/**
 * Created by Sony on 13.11.2016.
 */
public class QuadraticPyramid extends ThreeDimShape {

    private double sideA;
    private double height;
    private double heightA;

    public QuadraticPyramid() {
    }

    public QuadraticPyramid(double sideA, double height, double heightA) {
        this.sideA = sideA;
        this.height = height;
        this.heightA = heightA;
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

    public double getHeightA() {
        return heightA;
    }

    public void setHeightA(double heightA) {
        this.heightA = heightA;
    }

    @Override
    public String toString() {
        return "QuadraticPyramid{" +
                "sideA=" + sideA +
                ", height=" + height +
                ", heightA=" + heightA +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        QuadraticPyramid that = (QuadraticPyramid) o;

        if (Double.compare(that.sideA, sideA) != 0) return false;
        if (Double.compare(that.height, height) != 0) return false;
        return Double.compare(that.heightA, heightA) == 0;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(sideA);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(heightA);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public double calcVolume() {
        return ((1/3)*(sideA*sideA)*height);
    }

    @Override
    public double calcSurfaceArea() {
        return ((sideA*sideA)+(4*((1/2)*sideA*heightA)));
    }
}
