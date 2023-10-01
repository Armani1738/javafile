package practice;

public class CarDriver {
    public static void main(String[] args){

       Car myCar = new Car("Armani","White",4);

        myCar.collectName();
        //System.out.println(myCar.collectName());
        System.out.printf("My default name is %s",myCar.collectName());
        System.out.printf("\nMy default color is %s",myCar.getColor());
        System.out.printf("\nMy default number of tyre is %d",myCar.collectTyre());

        myCar.changeName("Suzuki");
        String theCarName = myCar.collectName();

        myCar.setColor("Black");
        String theColor = myCar.getColor();

        myCar.changeTyre(4);
        int theTyre = myCar.collectTyre();

        System.out.printf("The name of my car is %s",theCarName);
        System.out.printf("\nThe color of my car is %s",theColor);
        System.out.printf("\nThe no of my car tyre is %d",theTyre);




    }
}
