import java.util.Arrays;
import java.io.IOException;


public class Main {

    public static void main(String[] args) {
//GHICI CINE E AICI
        /*System.out.println("Prima sesiune a fost in data de " + 28 + " februarie " + 2023);
        System.out.println(50 + " " + 20 + " Text");
        System.out.println("Dorim să reamintim că termenul de plată a facurilor emise ");
        System.out.println("de către Hidroelectrica este unul relaxat, ");
        System.out.println("de " + 45 + " de zile în cazul clienților casnici, ");
        System.out.println("respectiv de " + 30 + "de zile în cazul consumatorilor ");
        System.out.println("non-casnici, perioade pentru care nu sunt percepute penalități.");

        int nr = 10;
        System.out.println("Numarul nostru este: " + nr);
        nr = 16;
        System.out.println("Noul numar este: " + nr);
        String text = "Suntem la curs un numar de: ";
        System.out.println(text + nr);

        float a = 19.99f;
        double b = 19.99;

        System.out.println("Hey " +  text + nr + "b= " +b);

        char x = '@';
        System.out.println("Caracterul este " + x);

        int nr1 = 13;
        int nr2 = 5;
        double total = nr1 / nr2;
        System.out.println(total);*/

        /*//exercitii
        int a = 10;
        int b = a;
        a = 3;
        System.out.println("Este b = " + b + " mai mare ca a = " + a + "?");
        System.out.println("adunare a + b = " + (a + b));
        System.out.println("scadere a - b = " + (a - b));
        System.out.println("inmultire a * b = " + (a * b));
        System.out.println("impartire fara rest a / b = " + (a / b));
        System.out.println("restul impartirii lui a la b = " + (a % b));*/
/*
        int a = 10;
        int b = 2;
        int c = 3;
        System.out.println("Operatia de comparatie cu && este : " + (a > 22 || b > 1 && c>5));
        System.out.println("Operatia de comparatie cu || este: " + (a > 5 || b > 5));


        int x = 1;
        int j = 74;
        *//*int rezultat = 10 + x++;
        System.out.println(rezultat + " |x = " + x);

        int rez2 = 10 + ++j;
        System.out.println(rez2 + " |j= " + j);*//*

        if (x == 1) {
            System.out.println("1");
        }else if (x == 2){
            System.out.println("2");
        }else if (x == 3){
            System.out.println("3");
        }else if (x == 4){
            System.out.println("4");
        }else
            System.out.println("Final");

        int aa = 99;
        int rezz = 0;
        while (aa > 0){
            if (aa % 2 == 0){
                System.out.println("aa este = " + aa);
                rezz += aa;
                System.out.println("zz este = " + rezz);

            }
            aa--;
            System.out.println(rezz);

        }
        System.out.println("Rezultatul final este: " + rezz);*/


//        if (20 > 19){
//            System.out.println("20 este mai mare ca 18");
//        }
//        int x = 20;
//        int y = 18;
//        if (x < y) {
//            System.out.println("se indeplinesc conditiile");
//        } else if (x > y){
//            System.out.println("numerele sunt egale");
//        } else if (x%2 ==0){
//            System.out.println("numar par");
//        } else {
//            System.out.println("nu se indeplinesc conditiile");
//        }
/*      1. Pentru un aparat de cafea, se vor afisa mesaje in functie de nivelul de cafea ramas in aparat:
        0 – 30% Nivel minim
        31- 60% Nivel mediu
        61-90% Nivel ok
        91-100% nivel maxim
        alt nivel - verificati sensor nivel cafea*//*

        int nivel_cafea = 1;
        if (nivel_cafea >= 0 && nivel_cafea <= 30){
            System.out.println("Nivel minim");
        } else if(nivel_cafea > 30 && nivel_cafea <= 60){
            System.out.println("Nivel mediu");
        } else if(nivel_cafea>= 61 && nivel_cafea <= 90){
            System.out.println("Nivel ok");
        } else if(nivel_cafea>= 91 && nivel_cafea <= 100){
            System.out.println("Nivel maxim");
        } else {
            System.out.println("Verificati senzor nivel cafea");
        }


//        2. Folosind if, verificati daca numarul 5 este positiv sau negativ. Afisati mesaje in functie de
//                rezultat
        int nr = 5;
        if (nr > 0){
            System.out.println("Numarul este pozitiv");
        } else if (nr == 0) {
            System.out.println("Numarul este neutru(egal cu zero)");
        } else {
            System.out.println("Numarul este negativ");
        }

//        3. Folosind if, verificati daca numarul -5 este positiv sau negativ. Afisati mesaje in functie de
//                rezultat
        int nr2 = -5;
        if (nr2 >=0){
            System.out.println("Numarul este pozitiv");
        } else {
            System.out.println("Numarul este negativ");
        }

//        4. Folosind if, verificati daca numarul 3 este numar impar. Afisati mesaje in functie de rezultat
        int nr3 = 3;
        if (nr3 % 2 == 0){
            System.out.println("Numarul este par");
        } else {
            System.out.println("Numarul este impar");
        }

//        5. Folosind if, verificati daca numarul 2 este numar par. Afisati mesaje in functie de rezultat
        int nr4 = 2;
        if (nr4 % 2 == 0){
            System.out.println("Numarul este par");
        } else {
            System.out.println("Numarul este impar");
        }

//        6. Folosind if verificati daca numerele 20 si 30 sunt mai mari ca 10 si afisati suma lor
        int nr5 = 20;
        int nr6 = 30;
        int suma = nr5+nr6;
        if (nr5>10 && nr6 >10){
            System.out.println("Suma numerelor este " + suma);
        }

//        7. Folosind if verificati daca numerele 92 si 50 sunt divizibile cu 5 diferenta lor
        int nr7 = 92;
        int nr8 = 50;
        int diferenta = nr5-nr6;
        if (nr7 % 5 == 0 && nr7 % 5 == 0){
            System.out.println("Diferenta numerelor este " + diferenta);
        } else {
            System.out.println("Numerele nu sunt divizibile cu 5");
        }*/

     /*   int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }*/

    /*    int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i > 5);*/

/*//        1. Folosind while, verificati care numere din intervalul -5 -> 5 sunt pozitive. Afisati
//        mesaje in functie de rezultat
        int i = -5;
        while(i >= -5 && i <= 5){
            if (i > 0) {
                System.out.println("Numarul " + i + " este pozitiv");
            }
            i++;
        }

//        2. Folosind while, verificati care numere din intervalul -5 -> 5 sunt negative. Afisati
//        mesaje in functie de rezultat
        int i2 = -5;
        while(i2 >= -5 && i2 <= 5){
            if (i2 < 0) {
                System.out.println("Numarul " + i2 + " este negativ");
            }
            i2++;
        }
//        3. Folosind while, verificati care numere din intervalul 2 -> 10 sunt numere pare. Afisati
//        mesaje in functie de rezultat
        int i3 = 2;
        while (i3 <= 10){
            if (i3 %2 == 0){
                System.out.println("Numarul " + i3 + " este un numar par");
            }
            i3++;
        }
//        4. Folosind while, verificati care numere din intervalul 2 -> 10 sunt numere impare.
//                Afisati mesaje in functie de rezultat
        int i4 = 2;
        while (i4 <= 10){
            if (i4 % 2 != 0){
                System.out.println("Numarul " + i4 + " este un numar impar");
            }
            i4++;
        }
//        5. Folosind while afisati numerele de la 5 -> 20(inclusiv)
        int i5 = 5;
        while (i5 <21){
            System.out.println(i5);
            i5++;
        }
//        6. Folosind while afisati suma numerelor de la 1->10(inclusiv)
        int i6 = 1;
        int suma = 0;
        while (i6 <11){
            suma +=i6;
            i6++;
        }
        System.out.println("Suma numerelor de la 1->10 este " + suma);*/

       /* for (int i = 5; i == 0; i--){
            System.out.println(i);
        }*/
       /* for(int i=0; i<=10; i=i+2){
            System.out.println(i);
        }*/

/*//        1. Folosind for, afisati puterile lui 2 pana la puterea a 10-a, incepand cu puterea 2-a
        int putere = 2;
        for (int i = 2; i<=10; i++){
            putere *= 2;
            System.out.println("Puterea lui 2 la " + i + " = " + putere);
            System.out.println("Puterea lui 2 la " + i + " = " + Math.pow(2,10);

        }
//        2. Folosind for, verificati care numere de la -5 la 5 sunt positive. Afisati mesaje in functie
//        de rezultat
        for (int i1 = -5;i1<=5;i1++){
            if (i1 > 0){
                System.out.println(i1);
            }
        }
//        3. Folosind for, verificati care numere de la -5 la 5 sunt negative. Afisati mesaje in
//        functie de rezultat
        for (int i2 = -5;i2<=5;i2++){
            if (i2 < 0){
                System.out.println(i2);
            }
        }
//        4. Folosind for, verificati care numere din intervalul 2 -> 10(inclusiv) sunt numere pare.
//        Afisati mesaje in functie de rezultat
        for (int i3 = 2; i3 <= 10;i3++){
            if (i3 %2 == 0){
                System.out.println(i3);
            }
        }
//        5. Folosind for, verificati care numere din intervalul 2 -> 10 (inclusiv) sunt numere
//        impare. Afisati mesaje in functie de rezultat
        for (int i4 = 2; i4 <= 10;i4++){
            if (i4 %2 != 0){
                System.out.println(i4);
            }
        }
//        6. Folosind for afisati numerele de la 1 -> 10 (inclusiv)
        for (int i5= 1;i5<11; i5++){
            System.out.println(i5);
        }

//        7. Folosind for afisati suma numerelor de la 1->10 (inclusiv)
        int suma = 0;
        for (int i6= 1;i6<11; i6++){
            suma +=i6;
        }
        System.out.println("Suma numerelor este: " + suma);


//        8. Folosind for afisati numerele divizibile cu 5 din intervalul 0->100(inclusiv)
        for (int i7 = 0; i7<=100; i7++){
            if (i7 %5 == 0){
                System.out.println(i7);
            }
        }*/

        /*for (int i = 0; i < 10; i++){
            if (i == 4){
                break;
            }
            System.out.println(i);
        }*/

      /*  for (int i = 0; i < 10; i++){
            if (i == 4){
                continue;
            }
            System.out.println(i);
        }*/

//        estePatrat(2,3);
//        arie(2,2);
//        perimetru(3,4);
//        System.out.println(" ");
//        triunghi(2,6,3);
//        farenheit(30);
//        mile(100);
//        sumaNumerelor(10);
//        anulNasterii(1990);
//        anulNasterii(1970);
//        anulNasterii(-1990);
//        System.out.print("Numere impare: ");
//        numereImpare(-30,30);
//
//        System.out.println("");
//        ani(1986);
//
//        System.out.println("");
//        nrPrim(79);
//
//        int[] array = {1,3,5,7,9};
//        System.out.println(array[4]);
//
//        int[] array2 = new int[3];
//        array2[0] = 1;
//        array2[1] = 10;
//        array2[2] = 100;
//        System.out.println(Arrays.toString(array2));
    }
//        1. Scrieti o metoda care sa primeasca doi parametrii(lungime si latime). In functie de valorile
//        primite afisati daca este un dreptunghi sau un patrat
        static void estePatrat(int lungime, int latime) {
            if (lungime == latime) {
                System.out.println("Este patrat.");
            } else {
                System.out.println("Este dreptunghi.");
            }
        }

//        2. Scrieti o metoda care sa primeasca doi parametrii(lungime si latime). In functie de valorile
//        primite calculati aria si afisati-o. De asemenea afisati daca este dreptunghi sau patrat
        static void arie(int lungime, int latime){
            System.out.println("Aria este " + (lungime*latime));
            estePatrat(lungime,latime);
        }


//        3. Scrieti o metoda care sa primeasca doi parametrii(lungime si latime). In fucntie de valorile
//        primite calculati perimetrul si afisati-l. De asemenea afisati daca este dreptunghi sau patrat
        static void perimetru(int lungime, int latime){
            System.out.println("Perimetrul este " + 2*(lungime+latime));
            estePatrat(lungime,latime);
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

//        Optional 1. Scrieti o metoda care aduna toate numerele de la 0 pana la numarul dat
            static void sumaNumerelor(int numar){
            int suma = 0;
            for(int i = 0; i<= numar; i++){
                suma +=i;
            }
            System.out.println("Suma numerelor este: " + suma);
            }

    //        Optional 2. Sa se scrie o metoda care afiseaza toate numerele impare din intervalul dat ex:[-100,100]
            static void numereImpare(int a, int b){
                for(int i = a; i<= b; i++){
                    if(i % 2 != 0 ){
                        System.out.print(i + " ");
                    }
                }
            }

    //        Optional 3. Sa se scrie o metoda care afiseaza fiecare an de cand v-ati nascut pana in prezent
            static void ani(int an){
            int i  = an;
                while(i <=2023){
                    System.out.print(i + " ");
                    i++;
                }
            }
    //        Optional 4. Sa se scrie o metoda care afiseaza daca numarul dat este prim sau nu(se imparte doar la 1 si la el insusi)
            static void nrPrim(int numar){
                boolean estePrim = true;
                for (int i = 2; i < numar; i++){
                    if(numar % i == 0){
                        estePrim = false;
                    }
                }
                if(estePrim) {
                    System.out.println("Numarul " + numar + " este prim");
                }else{
                    System.out.println("Numarul " + numar +  "  nu este prim");
                }
            }
//          Varsta unei persoane. Este adulta sau nu
        static void anulNasterii(int an){
//            if (an < 2007){
//                System.out.println("Persoana este minora");
//            } else {
//                System.out.println("Persoana este majora");
//            }

            // caz 0= invalid / caz 1 =minor / caz 2 = major
            /*int caz = 0;
            if (an <2007 && an > 1900){
                caz = 2;
            } else if (an > 2007){
                caz = 1;
            } else {
                caz = 0;
            }
            System.out.println(caz);
            switch (caz){
                case 0:{
                    System.out.println("Varsta este invalida");
                    break;
                }
                case 1:{
                    System.out.println("Persoana este minora");
                    break;
                }
                case 2:{
                    System.out.println("Persoana este majora ");
                    break;
                }
            }*/

            }
            /*static boolean major(String tara, int varsta) {
                switch (tara) {
                    case "Romania":
                        if (varsta >= 18) {
                            System.out.println("Major in Romania");
                            return true;
                        }
                        break;
                    case "SUA":
                        if (varsta >= 21) {
                            System.out.println("Major in SUA");
                            return true;
                        }
                        break;
                    default: {
                        if (varsta >= 25) {
                            System.out.println("Major in toata lumea");
                            return true;
                        } else {
                            return false;
                        }
                    }
                }
            }*/




}
