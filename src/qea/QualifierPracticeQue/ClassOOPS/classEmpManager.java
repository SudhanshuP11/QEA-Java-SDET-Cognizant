package qea.QualifierPracticeQue.ClassOOPS;


class Employee{
    String name;
    int salary;
    String designation;
    public Employee(String name, int salary, String designation){
        this.name = name;
        this.salary = salary;
        this.designation = designation;
    }
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Salary : "+salary);
    }
}
class Manager extends Employee{
    String department;
    Manager(String name, int salary, String designation, String department){
        super(name, salary, designation);
        this.department = department;
    }
    @Override
    void display(){
//        System.out.println("Name : "+name);
//        System.out.println("Salary : "+salary);
        super.display();
        System.out.println("Department : "+department);
        System.out.println("Designation : "+designation);
    }
}
public class classEmpManager {
    public static void main(String[] args) {
        Manager m1 = new Manager("Mike", 10000, "Manger", "HR");
//        Employee e1 = new Employee("Mike", 10000, "Mike");
        m1.display();
    }
}
