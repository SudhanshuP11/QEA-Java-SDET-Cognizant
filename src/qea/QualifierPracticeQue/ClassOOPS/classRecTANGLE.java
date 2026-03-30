package qea.QualifierPracticeQue.ClassOOPS;

class classRecTANGLE1{
    double length;
    double width;
    void area(){
        System.out.println("Area of classRecTANGLE: "+length*width);
    }
}
public class classRecTANGLE{
    public static void main(String[] args) {
        classRecTANGLE1 obj = new classRecTANGLE1();
        obj.length=10.1;
        obj.width=10.1;
        obj.area();

    }
}
