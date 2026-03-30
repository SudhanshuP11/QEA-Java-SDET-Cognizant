package qea.QualifierPracticeQue.ClassOOPS;
// only one public class will be there in a code file
class Student1 {
    String name;
    int age;
    double mark;
    Student1(String name,int age,double mark){
        this.name=name;
        this.age=age;
        this.mark=mark;
    }
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Mark: " + mark);
    }
}
public class Student{
    public static void main(String[] args){
        Student1 s1 = new Student1("Rober",19,50);
        s1.display();
        Student1 s2 = new Student1("Robert2",12,60);
        s2.display();
    }
}
