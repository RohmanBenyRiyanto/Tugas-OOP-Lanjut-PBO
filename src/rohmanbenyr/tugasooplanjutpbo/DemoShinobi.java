/*
 * Copyright (c) 2020.This code was written by Rohman Beny R (19104060)
 */

package rohmanbenyr.tugasooplanjutpbo;

public class DemoShinobi {
    public static void main(String args[]) {
        Konohagakure[] arr = new Konohagakure[3];

        arr[0] = new Konohagakure();
        arr[1] = new Konohagakure();
        arr[2] = new Konohagakure();

        arr[0].setData(012606, "Uchiha Sasuker", "Genin");
        arr[1].setData(012607, "Uzumaki Naruto", "Genin");
        arr[2].setData(012601, "Haruno Sakura" , "Chunin");

        System.out.println("Konohagakure Shinobi 1");
        arr[0].display();

        System.out.println("Konohagakure Shinobi 2");
        arr[1].display();

        System.out.println("Konohagakure Shinobi 3");
        arr[2].display();
    }
}
