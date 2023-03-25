public class Dreptunghi {
    // atribute
    int latime;
    int lungime;
    String culoare;

    // constructori

    public Dreptunghi(){
        latime = 1;
        lungime = 1;
        culoare = "rosu";
    }

    public Dreptunghi(int latimeActuala, int lungimeActuala, String culoareActuala){
        latime = latimeActuala;
        lungime = lungimeActuala;
        culoare = culoareActuala;
    }

    //metode
    int calculeazaPerimetru(){
        return 2 * (latime + lungime);
    }

    int calculeazaArie(){
        return lungime * latime;
    }

    void afiseazaCuloare(){
        System.out.println(culoare);
    }


}
