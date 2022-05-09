package chapter6;

public class Rectangle {
    double length;
    double width;

    //default Constructors
    public Rectangle(){
        width = 0;
        length = 0;
    }

    //Contractors with input value
    public Rectangle(double length,double width){
        this.length = length;  //can be set thi way
        setWidth(width); //or can be set this way.
    }

    public double getLength(){
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calculatePerimeter(){
        return (2*length) + (2*width);
    }
    public double calculateArea(){
        return length * width;
    }
}
