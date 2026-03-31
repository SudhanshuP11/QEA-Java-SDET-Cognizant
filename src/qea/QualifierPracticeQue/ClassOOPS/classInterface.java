package qea.QualifierPracticeQue.ClassOOPS;


interface Playable{
    void play();
}
class Guitar implements Playable{
    @Override
    public void play(){
        System.out.println("Guitar play");
    }
}
class Piano implements Playable{
    @Override
    public void play(){
        System.out.println("Piano play");
    }
}
public class classInterface {
    public static void main(String[] args) {
        Guitar guitar = new Guitar();
        guitar.play();
        Piano piano = new Piano();
        piano.play();
    }
}
