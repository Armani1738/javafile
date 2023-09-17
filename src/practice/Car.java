package practice;

public class Car {
    private String name;
    private String color;
    private int noOfTyre;

    public Car(String name,String color,int tyre){
        this.name = name;
        this.color = color;
        noOfTyre = tyre;
    }
    public void changeName(String name){
        this.name = name;
    }
    public String collectName(){
        return name;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public void changeTyre(int tyre){
        this.noOfTyre = tyre;
    }
    public int collectTyre(){
        return noOfTyre;
    }
}
