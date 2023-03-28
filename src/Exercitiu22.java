public class Exercitiu22 {
    int lungime;
    int latime;

    public Exercitiu22(){
        lungime = 2;
        latime = 3;
    }

    public Exercitiu22(int lungimeActuala, int latimeActuala){
        lungime = lungimeActuala;
        latime = latimeActuala;
    }

    public int calculeazaAria(int lungime1, int latime1){
        return (latime1*lungime1);
    }

    public double calculeazaPerimetru(int lungime1, int latime1){
        return (2*(lungime1 + latime1));
    }



}
