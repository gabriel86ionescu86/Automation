public class Pisica {
    //atribute/proprietati/campuri
    int varsta;
    double greutate;
    String nume;

    // constructori
    public Pisica(){
        varsta = 0;
        greutate = 200;
        nume = "Pisi";
    }

    public Pisica(int varstaActuala, double greutateActuala, String numeActual){
        varsta = varstaActuala;
        greutate = greutateActuala;
        nume = numeActual;
    }



    //metode/comportament
    void scoateSunet(String sunet){
        System.out.println("miau ");
    }

    void repetaSunet(String sunet, int nrDati){
        for(int i = 0; i < nrDati; i++){
            System.out.println(sunet);
        }
    }
}
