package fabric;

import java.util.ArrayList;

public class Builder {
    public String model;
    public String brand;
    public String wheels;
    public String color;
    public String engine;
   public ArrayList Car;

    public static ArrayList getCar (String brand, String model, String engine, String color, String wheels  ){

        ArrayList<Cars> Car = new ArrayList<Cars>();
        Car.add(new Brand(brand));
        Car.add(new Model(model));
        Car.add(new Engine(engine));
        Car.add(new Color(color));
        Car.add(new Whille(wheels));
        return Car;
    }
}
