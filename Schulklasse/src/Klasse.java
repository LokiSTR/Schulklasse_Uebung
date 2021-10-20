public class Klasse {
    String _klassenlehrer;

    public void setKlassenlehrer(String klassenlehrer) {
        this._klassenlehrer = klassenlehrer;
    }
    public String getKlassenlehrer() {
        return _klassenlehrer;
    }

    public Klasse(String klassenlehrer){
        this.setKlassenlehrer(klassenlehrer);
    }
    
}