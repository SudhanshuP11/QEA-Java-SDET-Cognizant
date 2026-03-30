package qea.QualifierPracticeQue.ClassOOPS;
// only one public class will be there in a code file
class Student1 {
    String name;
    int age;
    double mark;
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Mark: " + mark);
    }
}
public class Student{
    public static void main(String[] args){
        Student1 s1 = new Student1();
        s1.name = "Robert";
        s1.age = 19;
        s1.mark = 4.5;
        s1.display();
        Student1 s2 = new Student1();
        s2.name = "Robert2";
        s2.age = 19;
        s2.mark = 4.5;
        s2.display();
    }
}
