public class Schueler {
    String _vorname;
    String _nachname;

    public Schueler(String vorname, String nachname){
        this.setVorname(vorname);
        this.setNachname(nachname);
    }

    public String getVorname() {
        return _vorname;
    }
    public String getNachname() {
        return _nachname;
    }


    public void setVorname(String vorname) {
        this._vorname = vorname;
    }
    public void setNachname(String nachname) {
        this._nachname = nachname;
    }
}
