package fh.java.geometry.model.trilateral;

/**
 * Created by Sony on 13.11.2016.
 */
public class Triangle extends TriangularShape {

    private double sideA;

    public Triangle() {
    }

    public Triangle(double sideA) {
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
        return "Triangle{" +
                "sideA=" + sideA +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Triangle triangle = (Triangle) o;

        return Double.compare(triangle.sideA, sideA) == 0;

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
        return ((sideA*sideA)*Math.sqrt(3))/4;
    }

    @Override
    public double calcPerimeter() {
        return 3 * sideA;
    }
}
