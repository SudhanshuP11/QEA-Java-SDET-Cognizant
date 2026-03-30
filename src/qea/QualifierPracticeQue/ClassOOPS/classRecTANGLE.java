package qea.QualifierPracticeQue.ClassOOPS;

class classRecTANGLE1{
    double length;
    double width;
    classRecTANGLE1(double length,double width){
        this.length=length;
        this.width=width;

    }
    void area(){
        System.out.println("Area of classRecTANGLE: "+length*width);
    }
}
public class classRecTANGLE{
    public static void main(String[] args) {
        classRecTANGLE1 obj = new classRecTANGLE1(10,20);
        obj.area();

    }
}
