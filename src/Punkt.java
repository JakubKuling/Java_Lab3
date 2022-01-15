/* klasa Punkt */
public class Punkt {
    /* stworzyć zmienne prywatne pX, pY, pZ */
    private int px, py, pz;
    int roznica;

    /* stworzyć
        a) pusty konstruktor,
        b) konstruktor inicjalizujacy zmienną pX,
        c) konstruktor inicjalizujący wszystkie zmienne,
        d) stworzyć settery i gettery,
        e) getter do zmiennej pZ niech zwraca return pZ * 10;

        podpowiedz ALT + INSERT można wybrać generowanie automatyczne
        konstruktora, getterów, setterów, nadpisywanie metody toString() i inne ...
    */
    Punkt() {
    }

    Punkt(int px) {
        this.px = px;
    }

    Punkt(int xy, int py, int pz) {
        this.px = px;
        this.py = py;
        this.pz = pz;
    }

    public int getpx() {
        return px;
    }

    public int getpy() {
        return py;
    }

    public int getpz() {
        return pz * 10;
    }

    public void setpx(int px) {
        this.px = px;
    }

    public void setpy(int py) {
        this.py = py;
    }

    public void setpz(int pz) {
        this.pz = pz;
    }

    public int suma() {
        return px + py +pz;
    }

    public void pokaz() {
        System.out.println("Zmienna pz: " + pz + ", Zmienna py: " + py +"Zmiennpy" +py);
    }

    public int roznica(){
       return px - py - pz;
    }
    public int roznica1(int x, int y, int z){
        return pz*x - pz*y - pz*z;
    }
    public String toString(){
        return "Punkt{" + "px=" + px + ", py=" + py + ", py=" + py + '}';
    }


    /* Stworzyć metody
        a) suma - sumująca wszystkie wartości w klasie
        b) różnica - metody przeciążone roznica(){} i roznica(int x, int y, int z){}
        c) metody różnica mają wykonwywać dzialania :
            roznica(){ return pX - pY - pZ} i roznica(int x, int y, int z){ return pX*x - pY*y - pZ*z }
        d) nadpisać metodę toString(), aby zwracała wszystkie wartości pól, analogicznie jak w przykładzie
     */
}
