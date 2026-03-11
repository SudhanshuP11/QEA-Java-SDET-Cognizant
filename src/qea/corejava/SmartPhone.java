package qea.corejava;

//public class qea.corejava.SmartPhone {
//    String brand;
//    int batteryLevel;
//    void charge(int amount){
//        batteryLevel+=amount;
//    }
//    void use(int amount){
//        batteryLevel-=amount;
//        if(batteryLevel<0){
//            batteryLevel=0;
//            System.out.println("Phone Died");
//        }
//    }
//    void displayDetails(){
//        System.out.println("Brand: "+brand+" Battery Level: "+batteryLevel+"%");
//    }
//}
//class qea.corejava.SmartPhoneMain{
//    public static void main(String[] args) {
//        qea.corejava.SmartPhone myPhone = new qea.corejava.SmartPhone();
//        myPhone.brand="Samsung";
//        myPhone.batteryLevel=50;
//        myPhone.charge(20);
//        myPhone.use(30);
//        myPhone.displayDetails();
//    }
//}
public class SmartPhone {
    private String brand;
    private int batteryLevel;

    public SmartPhone(String brand, int initialBattery) {
        this.brand = brand;

        setBatteryLevel(initialBattery);

    }
    public void setBatteryLevel(int initialBattery) {
        // Check if the INPUT is valid (between 0 and 100)
        if(initialBattery >= 0 && initialBattery <= 100) {
            this.batteryLevel = initialBattery; // Use '=' to assign
        } else {
            this.batteryLevel = 0;
            System.out.println("Invalid battery level");
        }
    }
    public void use(int amount){
        if(this.batteryLevel-amount<0){
            this.batteryLevel=0;
            System.out.println("Phone Died");
        }else{
            this.batteryLevel-=amount;
        }
    }
    public void displayDetails(){
        System.out.println("Brand: "+brand+" Battery Level: "+batteryLevel+" %");
    }

}
class SmartPhoneMain{
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("Samsung",50);
        myPhone.use(30);
        myPhone.displayDetails();
    }
}