package qea.QualifierPracticeQue.ClassOOPS;


class Calc{
    int add(int a, int b){
        return a+b;
    }
    double add(double a, double b){
        return a+b;
    }
}
public class classMethodOverloading {
    public static void main(String[] args) {
        Calc calc = new Calc();
        System.out.println(calc.add(2,3));
        System.out.println(calc.add(2.5,3.0));
    }
}
