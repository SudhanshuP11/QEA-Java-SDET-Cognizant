package qea.QualifierPracticeQue.ClassOOPS;

abstract class Shape{
//    double length;
//    double width;
//    Shape(double length, double width){
//        this.length = length;
//        this.width = width;
//    }
    abstract void area();

}
class Rectangle extends Shape{
    double length;
    double width;
    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    @Override
    void area(){
        System.out.println("Area of rectangle: "+length*width);
    }
}
class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    @Override
    void area(){
        System.out.println("Area of Circle: "+Math.PI*radius*radius);
    }
}
public class classAbstract {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10,20);
        rectangle.area();
        Circle circle = new Circle(10);
        circle.area();
    }
}
