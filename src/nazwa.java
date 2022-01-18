public class nazwa {
    protected String nazwa;
    protected String Rok;
    private  boolean lub;

    public nazwa(String nazwa, String Rok){
        this.nazwa = nazwa;
        this.Rok = Rok;
        lub = true;
    }

    public String getnazwa() {
        return nazwa;
    }

    public void setnazwa(String nazwa) {
        nazwa = nazwa;
    }

    public String getRok() {
        return Rok;
    }

    public void setRok(String Rok) {
        this.Rok = Rok;
    }

    @Override
    public String toString(){
        return "[nazwa: " +nazwa+ '\''+
                ", Rok: " +Rok+ '\''+
                ", lub: " +(lub ? "Tak" : "Nie")+
                ']';

    }
}