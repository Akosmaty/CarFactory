package fabric;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {



        ArrayList<Cars> car =  Builder.getCar("Alfa", "Stelvio", "1900", "Blue", "19");
        ArrayList<Cars> afla =  Builder.getCar("Alfa", "MiTO", "2800", "Red", "15");

        printer(car);
        printer(afla);



    }

    public static void printer(ArrayList<Cars> car){

        for (int i=0; i < car.size(); i++){

            System.out.print(car.get(i));
        }
        System.out.println();
    }




}
