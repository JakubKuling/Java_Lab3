public class Dodatek extends nazwa{
    protected double cena;

    public Dodatek(String nazwa, String rok, double cena){
        super(nazwa, rok);
        this.cena = cena;
    }
    @Override
    public String toString(){
        return "nazwa[" +
                super.toString()+
                ", cena: " +cena+
                ']';
    }
}