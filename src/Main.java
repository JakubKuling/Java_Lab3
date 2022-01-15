import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw 2 klasy */
        /* zad.1
            a) Stworzyć publiczną klasę Student z 2-ma polami String, 1 polem int i 1 polem boolean,
            klasa ma się znajdować w osobnym pliku Student.java
            b) stworzyć 3 objekty klasy student i wstawić je do tablicy
            c) wyświetlić dane z tablicy, użyć pętli for lub forEach
            d) dane powinny być estetycznie przedstawione
         */


        List<student> studentList = new ArrayList<>();

        student student = new student();
        student.imie = "Kuba";
        student.nazwisko = "Kuling";
        student.indeks = 57080;
        studentList.add(student);

        student = new student();
        student.imie = "Maciek";
        student.nazwisko = "adamczyk";
        student.indeks = 12412;
        studentList.add(student);

        student = new student();
        student.imie = "agnieszka";
        student.nazwisko = "misiewicz";
        student.indeks = 12451;
        studentList.add(student);
        System. out.println(student.toString());

        for (student q : studentList) {
            System.out.println(q.imie + "--" + q.nazwisko + "--" + q.indeks );
        }
        }







        }










