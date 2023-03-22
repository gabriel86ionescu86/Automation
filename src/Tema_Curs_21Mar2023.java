import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Tema_Curs_21Mar2023 {
    public static void main(String[] args) {
        // apelam metoda Ex1
        /*metodaEx1(4,5);
        metodaEx1(7,7);

        // apelam metoda Ex2
        metodaEx2(5,7);
        metodaEx2(10,10);

        // apelam metoda Ex3
        metodaEx3(4,5);
        metodaEx3(7,7);

        // apelam metoda Ex4
        metodaEx4(4,4,4); // echilateral: 4
        metodaEx4(6,4,6); // isoscel: 4,6
        metodaEx4(4,5,6); // oarecare: 4,5,6
        metodaEx4(4,88,6); // non-triunghi: 4,6,88

        // apelam metoda Ex5
        metodaEx5(-10);
        metodaEx5(0);
        metodaEx5(10);
        metodaEx5(20);
        metodaEx5(30);

        // apelam metoda Ex6
        metodaEx6(50);
        metodaEx6(100);
        metodaEx6(150);
        metodaEx6(250);
        metodaEx6(300);*/

        // O metoda extra care curata toate fisierele de informatii
        //metodaCurataTot();



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

    static void metodaEx4(int x, int y, int z){ // Cream metoda pentru a da valori pentru Ex 4
        try {
            File myFile = new File("TemaCurs21-Exercitiul-4.txt");
            if(myFile.createNewFile()){
                System.out.println("Fisierul a fost creat: " + myFile.getName());
            } else {
                System.out.println("Fisierul deja exista!");
            }
        } catch (IOException e){
            System.out.println("S-a intamplat o eroare");
            e.printStackTrace();
        }
        // scriem rezultatul Ex 4 in fisierul TemaCurs21-Exercitiul-4.txt
        String raspuns = "Forma triunghiului cu laturile (" + x + ","+ y + "," + z + ") este: " + triunghi(x,y,z);
        try {
            FileWriter myWriter = new FileWriter("TemaCurs21-Exercitiul-4.txt",true);
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

    static void metodaEx5(int x){ // Cream metoda pentru a da valori pentru Ex 5
        try {
            File myFile = new File("TemaCurs21-Exercitiul-5.txt");
            if(myFile.createNewFile()){
                System.out.println("Fisierul a fost creat: " + myFile.getName());
            } else {
                System.out.println("Fisierul deja exista!");
            }
        } catch (IOException e){
            System.out.println("S-a intamplat o eroare");
            e.printStackTrace();
        }
        // scriem rezultatul Ex 4 in fisierul TemaCurs21-Exercitiul-5.txt
        String raspuns = x + "° Celsius = " + farenheit(x) + "° Farenheit";
        try {
            FileWriter myWriter = new FileWriter("TemaCurs21-Exercitiul-5.txt",true);
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

    static void metodaEx6(double x){
        try {
            File myFile = new File("TemaCurs21-Exercitiul-6.txt");
            if(myFile.createNewFile()){
                System.out.println("Fisierul a fost creat: " + myFile.getName());
            } else {
                System.out.println("Fisierul deja exista!");
            }
        } catch (IOException e){
            System.out.println("S-a intamplat o eroare");
            e.printStackTrace();
        }
        // scriem rezultatul Ex 4 in fisierul TemaCurs21-Exercitiul-6.txt
        String raspuns = x + " km/h = " + convertKmToMiles(x) + " mile/h";
        try {
            FileWriter myWriter = new FileWriter("TemaCurs21-Exercitiul-6.txt",true);
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

    static void metodaCurataTot(){
        try {
            for(int i = 1; i < 7; i++) {
                FileWriter myWriter = new FileWriter("TemaCurs21-Exercitiul-" + i + ".txt");
                myWriter.write("");
                myWriter.close();
                System.out.println("Fisier sters: TemaCurs21-Exercitiul-" + i + ".txt");
            }
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
    static String triunghi(int x, int y, int z){
        String formaTriunghi = "";
        if (((x+y) > z) && ((x+z) > y) && ((y+z) > x)) {
            if (x == y && y == z) {
                formaTriunghi =  "echilateral";
            } else if ((x == y) || (y == z) || (x == z)) {
                formaTriunghi = "isoscel";
            } else if (x != y && x != z && y != z) {
                formaTriunghi = "oarecare";
            }
        } else {
            formaTriunghi = "non-triunghi";
        }
        return formaTriunghi;
    }


    //        5. Scrieti o metoda care transforma din grade Celsius in Fahrenheit.
    //        Formula F=(C x 1,8)+32
    static int farenheit(int celsius){
        return (int) (celsius*1.8)+32;
    }

    //        6. Scrieti o metoda care transforma din km/h in mile/h.
    //        1 mila = 1,6 km
    static double convertKmToMiles(double km){
        return (km*0.62137);
    }
}
