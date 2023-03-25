public class Person {
    // atribute
    String nume;
    int varsta;
    double inaltime;

    // constructori

    public Person(){
        nume = "Gabriel";
        varsta = 36;
        inaltime = 1.68;
    }

    public Person(String numeActual, int varstaActual, double inaltimeActuala){
        nume = numeActual;
        varsta = varstaActual;
        inaltime = inaltimeActuala;
    }

    // metode
    void incrementeazaVarsta(){
        varsta++;
    }

    void print(){
        System.out.println("Nume: " + nume);
        System.out.println("Varsta: " + varsta);
        System.out.printf("Inaltime: " + inaltime);
    }

    boolean esteMajor(){
        if(varsta < 18){
            return false;
        } else {
            return true;
        }
    }


}
