import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Tema_Curs_21Mar2023 {
    public static void main(String[] args) {
        // apelam metoda Ex1
        /*metodaEx1(4,5);
        metodaEx1(7,7);*/

        // apelam metoda Ex2
        /*metodaEx2(5,7);
        metodaEx2(9,10);*/

        // apelam metoda Ex3
        /*metodaEx3(4,5);
        metodaEx3(7,7);*/



    } // sfarsitul clasei main

    static void metodaEx1(int x, int y){ // Cream metoda pentru a da valori pentru Ex 1
        // cream fisierul pentru Ex 1, daca nu exista deja
        try {
            File myFile = new File("TemaCurs21-Exercitiul-1.txt");
            if(myFile.createNewFile()){
                System.out.println("Fisierul a fost creat: " + myFile.getName());
            } else {
                System.out.println("Fisierul deja exista!");
            }
        } catch (IOException e){
            System.out.println("S-a intamplat o eroare");
            e.printStackTrace();
        }
        // adaugam rezultatul Ex 1 in fisierul TemaCurs21-Exercitiul-1.txt
        String raspuns = "Este (" + x + "," + y + ") " + "patrat: " + estePatrat(x,y);
        try {
            FileWriter myWriter = new FileWriter("TemaCurs21-Exercitiul-1.txt",true);
            BufferedWriter bw = new BufferedWriter(myWriter);
            bw.write(raspuns);
            bw.newLine();
            bw.close();
            System.out.println("Am adaugat cu succes raspunsul in fisier");
        } catch (IOException e){
            System.out.println("A fost intalnita o eroare");
            e.printStackTrace();
        }
    }

    static void metodaEx2(int x, int y){     // Cream metoda pentru a da valori pentru Ex 2
        // cream fisierul pentru Ex 2, daca nu exista deja
        try {
            File myFile = new File("TemaCurs21-Exercitiul-2.txt");
            if(myFile.createNewFile()){
                System.out.println("Fisierul a fost creat: " + myFile.getName());
            } else {
                System.out.println("Fisierul deja exista!");
            }
        } catch (IOException e){
            System.out.println("S-a intamplat o eroare");
            e.printStackTrace();
        }
        // scriem rezultatul Ex 2 in fisierul TemaCurs21-Exercitiul-2.txt
        String raspuns = "Aria pentru (" + x + "," + y + ") " + "este: " + arie(x, y);
        boolean patrat = estePatrat(x,y);
        String raspunsEstePatrat = " || Este patrat: " + patrat;
        try {
            FileWriter myWriter = new FileWriter("TemaCurs21-Exercitiul-2.txt",true);
            BufferedWriter bw = new BufferedWriter(myWriter);
            bw.write(raspuns + " " + raspunsEstePatrat);
            bw.newLine();
            bw.close();
            System.out.println("Am adaugat cu succes raspunsul in fisier");
        } catch (IOException e){
            System.out.println("A fost intalnita o eroare");
            e.printStackTrace();
        }
    }

    static void metodaEx3(int x, int y){     // Cream metoda pentru a da valori pentru Ex 3
        // cream fisierul pentru Ex 3, daca nu exista deja
        try {
            File myFile = new File("TemaCurs21-Exercitiul-3.txt");
            if(myFile.createNewFile()){
                System.out.println("Fisierul a fost creat: " + myFile.getName());
            } else {
                System.out.println("Fisierul deja exista!");
            }
        } catch (IOException e){
            System.out.println("S-a intamplat o eroare");
            e.printStackTrace();
        }
        // scriem rezultatul Ex 3 in fisierul TemaCurs21-Exercitiul-3.txt
        String raspuns = "Perimetrul pentru (" + x + "," + y + ") " + "este: " + perimetru(x, y);
        boolean patrat = estePatrat(x,y);
        String raspunsEstePatrat = " || Este patrat: " + patrat;
        try {
            FileWriter myWriter = new FileWriter("TemaCurs21-Exercitiul-3.txt",true);
            BufferedWriter bw = new BufferedWriter(myWriter);
            bw.write(raspuns + raspunsEstePatrat);
            bw.newLine();
            bw.close();
            System.out.println("Am adaugat cu succes raspunsul in fisier");
        } catch (IOException e){
            System.out.println("A fost intalnita o eroare");
            e.printStackTrace();
        }
    }

    //       1. Scrieti o metoda care sa primeasca doi parametrii(lungime si latime). In functie de valorile
//        primite afisati daca este un dreptunghi sau un patrat
    static boolean estePatrat(int lungime, int latime) {
        boolean estePatrat = true;
        if (lungime == latime) {
            return estePatrat;
        } else {
            return !estePatrat;
        }
    }

    //        2. Scrieti o metoda care sa primeasca doi parametrii(lungime si latime). In functie de valorile
//        primite calculati aria si afisati-o. De asemenea afisati daca este dreptunghi sau patrat
    static int arie(int lungime, int latime){
        return (lungime * latime) ;
    }


    //        3. Scrieti o metoda care sa primeasca doi parametrii(lungime si latime). In functie de valorile
//        primite calculati perimetrul si afisati-l. De asemenea afisati daca este dreptunghi sau patrat
    static int perimetru(int lungime, int latime){
        return (2*(lungime+latime));
    }

    //        4. Scrieti o metoda care primeste 3 parametrii ce reprezinta laturile unui triunghi. In functie de
//        valorile laturilor determinati ce tip de triunghi este(echilateral, isoscel, oarecare/scalen).De
//        asemenea verificati daca valorile introduse pentru laturi formeaza un triunghi valid.(suma a
//        doua laturi trebuie sa fie mai mare ca a 3-a latura)
    static void triunghi(int x, int y, int z){
        if (((x+y) > z) && ((x+z) > y) && ((y+z) > x)) {
            if (x == y && y == z) {
                System.out.println("Triunghiul este echilateral");
            } else if ((x == y) || (y == z) || (x == z)) {
                System.out.println("Triunghiul este isoscel");
            } else if (x != y && x != z && y != z) {
                System.out.println("Triunghiul este oarecare");
            }
        } else {
            System.out.println("Nu este un triunghi");
        }
    }


    //        5. Scrieti o metoda care transforma din grade Celsius in Fahrenheit. Formula F=(C x 1,8)+32
    static void farenheit(int celsius){
        System.out.println(celsius + " grade Celsius = " + ((celsius*1.8)+32) + " Farenheit");
    }

    //        6. Scrieti o metoda care transforma din km/h in mile/h. 1 mila = 1,6 km
    static void mile(int km){
        System.out.println(km + "/h = " + (km*1.6) + "/mph");
    }
}
