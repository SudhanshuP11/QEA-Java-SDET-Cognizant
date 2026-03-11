package qea.corejava;

public class Car {
    private String brand;
    private int price;
    public String getName(){
        return brand;
    }
    public void setName(String name){
        this.brand= name;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public static void main(String[] args){
        Car car = new Car();
        car.setName("Car1");
        car.setPrice(100);
        System.out.println(car.getName());
        System.out.println(car.getPrice());
    }
}
