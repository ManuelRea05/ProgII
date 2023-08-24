package Ejercicios;

public class Circle {

    protected double radius = 1.0;
    protected String color = "red";

    public Circle(){
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiametro(double radius){
        return Math.pow(radius, 2);
    }

    public double getArea(double radius){
        return getDiametro(radius) * Math.PI;
    }

    public double getCircumference(double radius){
        return getDiametro(radius) * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle[" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ']';
    }
}
