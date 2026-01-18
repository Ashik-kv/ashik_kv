package cred_ai;

import java.util.*;

public class ArrayListExample {
    public static void main(String []args){
        List<String> cars = new ArrayList<>() ;
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        Collections.sort(cars);

        System.out.println(cars);
    }
}
