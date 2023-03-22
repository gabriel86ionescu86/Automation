import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Curs21_03 {
    public static void main(String[] args) {
       /* int nr1 = metodaPlus(8,5);
        double nr2 = metodaPlus(4.3,6.20);
        System.out.println("int: " + nr1);
        System.out.println("double: " + nr2);*/

        // try/catch errors
        /*try {
            int[] numere = {1, 2, 3};
            System.out.println(numere[1]);
        } catch (Exception e){
            System.out.println("A fost gasita o eroarea: " + e);
        } finally {
            System.out.println("Programul a ajuns la final");
        }*/
        //varsta(17);
        //EX 1:
        //estePatrat(5,5);
        //EX 2:
        //arie(4,6);
        //EX 3:
        //perimetru(4,12);
        //EX 4:
        //triunghi(5,6,4);
        //EX 5:
        //farenheit(12);
        //EX 6:
        //mile(55);

        /*try {
            // cream un fisier
            File myFILE = new File("filename.txt");
            if (myFILE.createNewFile()) {
                System.out.println("File created: " + myFILE.getName());
            } else {
                System.out.println("File already exists!");
            }
        } catch (IOException e) {
            //throw new RuntimeException(e);
            System.out.println("An errror has occured");
            e.printStackTrace();
        }*/


        /*try {
            // scriem intr-un fisier
            FileWriter myWritter = new FileWriter("filename.txt");
            myWritter.write("Primul text intr-un fisier");
            myWritter.close();
            System.out.println("Am scris cu succes in fisier");
        } catch (IOException e){
            System.out.println("An errror has occured");
            e.printStackTrace();
        }*/

        /*try {
            // citim dintr-un fisier
            File myFIle = new File("filename.txt");
            Scanner myReader = new Scanner(myFIle);
            // parcurgem fisierul
            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (IOException e) {
            System.out.println("An errror has occured");
            e.printStackTrace();
        }*/


        // stergem un fisier
            /*File myFIle = new File("filename.txt");
            if(myFIle.delete()){
                System.out.println("FIsierul a fost sters" + myFIle.getName());
            } else {
                System.out.println("Nu s-a putut sterge fisierul");
            }*/

    }



    /*static int metodaPlus(int x, int y){
        return x+y;
    }

    static double metodaPlus(double x, double y){
        return x + y;
    }*/

    // int metoda(int x);
    // float metoda(float x);
    // double metoda(double x, double y);

    /*static void varsta(int age){
        if(age < 18){
            throw new ArithmeticException("Acces interzis. Este minor!");
        } else {
            System.out.println("Acces permis!");
        }
    }*/

//        RESCRIE EXERCITIILE PT METODE CU EXCEPTII PT A PRINDE SI A TRATA EXCEPTIA
//        1. Scrieti o metoda care sa primeasca doi parametrii(lungime si latime). In functie de valorile
//        primite afisati daca este un dreptunghi sau un patrat
    static void estePatrat(int lungime, int latime) {
        try {
            if (lungime == latime) {
                throw new ArithmeticException("Este patrat.");
            } else {
                throw new ArithmeticException("Este dreptunghi.");
            }
        } catch (Exception e){
            System.out.println("A fost gasita o eroare");
        }
    }

//        2. Scrieti o metoda care sa primeasca doi parametrii(lungime si latime). In functie de valorile
//        primite calculati aria si afisati-o. De asemenea afisati daca este dreptunghi sau patrat
    static void arie(int lungime, int latime){
        throw new ArithmeticException("Aria este " + (lungime*latime));
        //estePatrat(lungime,latime);
    }


//        3. Scrieti o metoda care sa primeasca doi parametrii(lungime si latime). In fucntie de valorile
//        primite calculati perimetrul si afisati-l. De asemenea afisati daca este dreptunghi sau patrat
    static void perimetru(int lungime, int latime){
        throw new ArithmeticException("Perimetrul este " + 2*(lungime+latime));
        //estePatrat(lungime,latime);
    }

//        4. Scrieti o metoda care primeste 3 parametrii ce reprezinta laturile unui triunghi. In functie de
//        valorile laturilor determinati ce tip de triunghi este(echilateral, isoscel, oarecare/scalen).De
//        asemenea verificati daca valorile introduse pentru laturi formeaza un triunghi valid.(suma a
//        doua laturi trebuie sa fie mai mare ca a 3-a latura)
    static void triunghi(int x, int y, int z){
        if (((x+y) > z) && ((x+z) > y) && ((y+z) > x)) {
            if (x == y && y == z) {
                throw new ArithmeticException("Triunghiul este echilateral");
            } else if ((x == y) || (y == z) || (x == z)) {
                throw new ArithmeticException("Triunghiul este isoscel");
            } else if (x != y && x != z && y != z) {
                throw new ArithmeticException("Triunghiul este oarecare");
            }
        } else {
            throw new ArithmeticException("Nu este un triunghi");
        }
    }

    //        5. Scrieti o metoda care transforma din grade Celsius in Fahrenheit. Formula F=(C x 1,8)+32
    static void farenheit(int celsius){
        throw new ArithmeticException(celsius + " grade Celsius = " + ((celsius*1.8)+32) + " Farenheit");
    }

    //        6. Scrieti o metoda care transforma din km/h in mile/h. 1 mila = 1,6 km
    static void mile(int km){
        throw new ArithmeticException(km + "/h = " + (km*1.6) + "/mph");
    }

    /*public int[] arr = new int[10];
    public void writeList(){
        try {
            arr[10] = 11;
        }
        catch(NumberFormatException e){
            System.out.println("NumberFormatException => " + e.getMessage());
        }
        catch (IndexOutOfBoundsException e2){
            System.out.println("IndexOutOfBoundsException => " + e2.getMessage());
        }
    }
    NumberList list = new.NumberList();
        list.writeList();*/


}


