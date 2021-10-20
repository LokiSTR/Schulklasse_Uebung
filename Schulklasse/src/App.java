public class App {
    static Schueler[] _schueler;
    static Klasse[] _klassenlehrer;

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        _schueler = new Schueler[20];
        _schueler[0] = new Schueler("Hans", "FLammenwerfer");

        _klassenlehrer = new Klasse[10];
        _klassenlehrer[0] = new Klasse("Herr Schmidt");

        Menu menu = new Menu();
        menu.startMenu();
    }

    public static void addObject(Object variablenname, Object[] getallarray){
        int i = 0;
        for (Object a :getallarray){
            if(a == null){
                getallarray[i] = variablenname; 
            }
            i++;
        }
    }

    public static void addSchueler(Schueler schueler){
        addObject(schueler, getAllSchueler());
    }
    public static void addKlasse(Klasse klassenlehrer){
        addObject(klassenlehrer, getAllKlassenlehrer());
    }
    public static Schueler[] getAllSchueler(){
        return _schueler;
    }
    public static Klasse[] getAllKlassenlehrer(){
        return _klassenlehrer;
    }
}
