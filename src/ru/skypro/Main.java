package ru.skypro;

public class Main {

    public static void main(String[] args) {

        Bicycle bicycle1 = new Bicycle("Coventry Rotary", 3);
        Bicycle bicycle2 = new Bicycle(null, 2);

        Car car1 = new Car(null, 4);
        Car car2 = new Car("Chrysler Turbine Car", 4);

        Truck track1 = new Truck("ГАЗ-АА", 6);
        Truck track2 = new Truck(null, 8);

        bicycle1.check();
        bicycle1.updateTyre();
        System.out.println();
        bicycle2.check();
        bicycle2.updateTyre();

        System.out.println("-----------------------------------------");

        car2.check();
        car2.updateTyre();
        car2.checkEngine();

        System.out.println("-----------------------------------------");

        track1.check();
        track1.updateTyre();
        track1.checkEngine();
        track1.checkTrailer();
        System.out.println("-----------------------------------------");


        Services servic1 = new Car("Porsche 356", 4);
        servic1.check();



    }
}

