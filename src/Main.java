import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        /* ćw 4 klasy */

        /* zad.1
            a) Stworzyć klasę Osoba z polami prywatnymi:
            - imie (String),
            - nazwisko (String),
            - indeks (Integer)

            b) stworzyc konstruktory, gettery i settery
            c) napisać metodę w klasie Osoba która zwróci informację o osobie,
         */

        /* zad.2
            a) Stworzyć klasę Student z polami prywatnymi
            - Osoba osoba,
            - WydzialEnum wydzial;
            b) stworzyć enum WydzialEnum (w nowym pliku) z kilkoma polami,
            c) stworzyc konstruktory, gettery i settery
            d) nadpisać metodę toString aby zwracała wszystkie elementy ładnie przedstawione :)
         */

        /* zad.3
            a) W klasie Main stworzyć 5 różnych studentów, (można za pomocą tego samego objektu)
            b) dodać studentów do Listy ArrayList,
            c) przeiterować listę za pomocą pętli forEach wywołując na każdym objekcie metodę toString() (w każdej iteracji);
         */
        Student q = new Student(new Osoba("Miłosz","Zięba", 15678), WydzialEnum.Sieci);
        Student w = new Student(new Osoba("Zenek","Chojenta", 42142), WydzialEnum.Programowania);
        Student e = new Student(new Osoba("Justyna","rurka", 84214), WydzialEnum.Sieci);
        Student r = new Student(new Osoba("michał","ziemowid", 52143), WydzialEnum.Admini);
        Student t = new Student(new Osoba("Adam","KAsztan", 12345), WydzialEnum.Programowania);

        ArrayList<Student> students = new <Student>ArrayList();
        students.add(q);
        students.add(w);
        students.add(e);
        students.add(r);
        students.add(t);
        for(Student qwer : students){
            System.out.println(qwer.toString());
        }
    }

}
