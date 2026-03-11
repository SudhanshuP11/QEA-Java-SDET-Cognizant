package qea.corejava;

interface RemoteControl1 {
    void switchOn();
}
class Tv implements RemoteControl1 {
    public void switchOn() {
        System.out.println("switch qea.corejava.Tv on");
    }
}
class Ac implements RemoteControl1 {
    public void switchOn() {
        System.out.println("switch qea.corejava.Ac on");
    }
}
public class RemoteControl {
    public static void main(String[] args) {
        RemoteControl1 myDevice;
        myDevice = new Tv();
        myDevice.switchOn();
        myDevice = new Ac();
        myDevice.switchOn();

    }
}
