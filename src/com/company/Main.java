package com.company;

public class Main {

    public static void main(String[] args) {
        Car name = new Car(3.2, 1997);
        name.zvuk(" Пип") ;
        name.PrintInfo();
        System.out.println(name.PrintInfo());
        System.out.println(" ");
        Tayota tayota = new Tayota("tayota", Collor.BLACK, 2019, 3.5);
        tayota.PrintInfo();
        tayota.zvuk(" пап");
        System.out.println(tayota.PrintInfo());
        Tayota ron = new Tayota("bmw", Collor.RED, 2018, 3.2);
        ron.zvuk(" Дан ",3);
        ron.PrintInfo();
        System.out.println(ron.PrintInfo());
    }

}
