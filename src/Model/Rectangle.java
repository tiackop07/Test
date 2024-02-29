package Model;

public class Retangle extends Shape{
    private double width = 1.0;
    private double lengh = 1.0;

    public Retangle(){

    }

    public Retangle(double width, double lengh, String color; boolean filled) {
        super(color. filled);
        this.width = width;
        this.lengh = lengh;
    }

    @Override
    public String toString() {
        return "Retangle{" +
                "width=" + getWidth() +
                ", lengh=" + getLengh() +
                ", filled=" + filled +
                '}' + super.toString();
    }

    public Retangle(double width, double lengh) {
        this.width = width;
        this.lengh = lengh;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLengh() {
        return lengh;
    }

    public void setLengh(double lengh) {
        this.lengh = lengh;
    }
}
