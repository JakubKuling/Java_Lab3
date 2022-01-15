import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw 3 klasy */

        /*  zad.1 - Najpierw należy uzupełnić kod w klasie Punkt.java,
            a) stworzyć objekt punktA typu Punkt,
            w konstruktorze zainicjować zmienną pX --> np. new Punkt(7), wykonać metodę punktA.toString();
            b) następnie ponownie wywopać konstruktor inicjalizujący wszystkie pola z klasy
            --> np. punkt = new Punkt(1, 2, 3);, wykonać metodę punktA.toString();
            c) nadpisać wartości pól z objektu punktA za pomocą setterów i
            ponownie wywołać metodę toString();
            d) wypisać wartości pól (za pomocą getterów),
            e) wywołać metody suma i róznica (obie wersje) z klasy punkt
        */
        Punkt punktA = new Punkt();
        punktA.setpx(6);
        punktA.toString();

        Punkt punktB = new Punkt();
        punktB.setpy(4);

        Punkt punktC = new Punkt();
        punktC.setpz(2);
        System.out.printf("x = %d, y = %d","z = %d/n", punktA.getpx(), punktB.getpy());
        System.out.println("Suma: " + punktA.suma() + "\n");


    }
}
