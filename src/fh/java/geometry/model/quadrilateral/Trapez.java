package fh.java.geometry.model.quadrilateral;

/**
 * Created by Sony on 13.11.2016.
 */
public class Trapez extends QuadrangularShape {

    private double sideA;
    private double sideB;
    private double sideC;
    private double sideD;
    private double height;

    public Trapez() {
    }

    public Trapez(double sideA, double sideB, double sideC, double sideD, double height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
        this.height = height;
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

    public double getSideD() {
        return sideD;
    }

    public void setSideD(double sideD) {
        this.sideD = sideD;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Trapez{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                ", sideD=" + sideD +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Trapez trapez = (Trapez) o;

        if (Double.compare(trapez.sideA, sideA) != 0) return false;
        if (Double.compare(trapez.sideB, sideB) != 0) return false;
        if (Double.compare(trapez.sideC, sideC) != 0) return false;
        if (Double.compare(trapez.sideD, sideD) != 0) return false;
        return Double.compare(trapez.height, height) == 0;

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
        temp = Double.doubleToLongBits(sideD);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public double calcArea() {
        return ((sideA + sideC) * height)/2;
    }

    @Override
    public double calcPerimeter() {
        return sideA + sideB + sideC + sideD;
    }
}
