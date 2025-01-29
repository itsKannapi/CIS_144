package GeometryApp;

public class Rectangle {
    private double width;
    private double height;
    private double Area;

    public Rectangle(double w, double h){
        this.width= w;
        this.height = h;
    }
    public void CalcArea(){
        this.Area = this.width*this.height;
    }

    public double getArea() {
        return Area;
    }

    public void setArea(double area) {
        Area = area;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
