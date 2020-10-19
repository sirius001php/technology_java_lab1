package com.CarBody;

public class Main {

    public static void main(String[] args) {
        Car avtopark = new Car("Volkswagen");
        avtopark.addBody(new Passenger("Golf", "ZFA22300005556777", BodyType.Hatchback, 2019, 1789, 4284, 5, "C"));
        avtopark.addBody(new Passenger("Passat", "KTA22340055556333", BodyType.Sedan, 2015, 1832, 4767, 5, "D"));
        avtopark.addBody(new Passenger("Passat", "ZXC22340123556333", BodyType.Stretch, 2012, 1832, 4867, 5, "D"));
        avtopark.addBody(new Passenger("Golf", "MLA22340200356744", BodyType.Convertible, 2019, 1709, 4084, 4, "C"));
        avtopark.addBody(new Truck("Caddy", "PZEL2340200356744", BodyType.Van, 2010, 1794, 4876, 750));
        avtopark.addBody(new Truck("Transporter", "PlEF234FE00M6744", BodyType.Pickup, 2010, 1904, 5292, 2050));
        printInfo(avtopark);
    }
//    виводить всю інформацію на екран
    public static void printInfo(Car cars){
        System.out.println("Hi, below you can see some information about the body of different models of the brand " + cars.getMark() + ":");
        for(int i = 0; i < cars.getSize(); i++){
            System.out.println(cars.getBoody(i).toString());
        }
    }
}

