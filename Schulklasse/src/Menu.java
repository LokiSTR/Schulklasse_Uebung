public class Menu {
    
    public void startMenu(){
        for (Schueler schueler: App.getAllSchueler()){
            if (schueler != null){
                System.out.println(schueler.getVorname() + " " + schueler.getNachname());
            }
        }
        for (Klasse klasse: App.getAllKlassenlehrer()){
            if (klasse != null){
                System.out.println(klasse.getKlassenlehrer());
            }
        }
    }

}
