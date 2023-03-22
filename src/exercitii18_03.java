public class exercitii18_03 {
    public static void main(String[] args) {
        // sa se calculeze factorialul unui nr intreg
       /* int numar = 4;
        int factorial = 1;
        for (int i = 1; i<= numar; i++){
            factorial *= i;
        }
        System.out.println(factorial);*/

        // sa se verifice daca un nr n are toate cifrele impare
       /* int numar = 955375918;
        boolean estePar = true;
        while (numar > 0){
            int val = numar %10;
            if (val % 2 == 0){
                estePar = false;
                break;
            }
            numar /=10;
        }
        if (estePar){
            System.out.println("Numarul are toate cifrele impare");
        } else {
            System.out.println("Numarul NU are toate cifrele impare");
        }*/

        //pt un nr n sa se afiseze toti divizorii
        /*int nr = 12;
        for (int i = 1; i<= 12; i++){
            if (nr % i == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();*/

        //scrie un program care afiseaza toate nr negative din array
        /*int[] lista = {1,2,-2,4,-1,5,9,-6,7,8,-4};
        for (int i: lista){
            if (i<0){
                System.out.print(i + " ");
            }
        }
        System.out.println();*/

        // scrie un program care calculeaza suma multiplilor de 3 dintr-un array
        /*int[] lista = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int suma = 0;
        for (int element : lista) {
            if (element % 3 == 0){
                suma +=element;
            }
        }
        System.out.println("Suma multiplilor de 3 este: " + suma);*/

        // sa se scrie un program care cauta un element k intr-o lista si sa se afiseze daca a fost gasit
       /* int[] lista = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int k = 4;
        boolean gasit = false;
        for (int element : lista){
            if (k == element){
                gasit = true;
                break;
            }
        }
        if (gasit){
            System.out.println("Elementul " + k + " a fost gasit");
        } else {
            System.out.println("Elementul " + k + " nu a fost gasit");
        }*/

        //sa se caute elemn k in array. daca e gasit sa se afiseze indexul primei aparitii
        /*int[] lista = {1,2,3,4,5,6,7,4,9,10,11,12,13,14,15};
        int k = 4;
        boolean gasit = false;
        for( int el = 0; el < lista.length; el++){
            if (k == lista[el]){
                System.out.println("Elementul " + k + " a fost gasit la indexul " + el);
                gasit = true;
                break;
            }
        }
        if (gasit == false){
            System.out.println("Elemenul " + k + " nu este in lista");
        }*/

        //sa se afiseze de cate ori apare un nr k intr-un array
        /*int[] lista = {1,2,3,4,5,6,7,8,9,4,10,11,12,13,4,14,15,4};
        int k = 4;
        int contor = 0;
        for (int element : lista){
            if (element == 4){
                contor++;
            }
        }
        System.out.println("Elementul " + k + " se gaseste de " + contor + " ori.");*/

        // sa se scrie daca un element k este mai mare decat toate elementele dintr-o lista
        /*int[] lista = {1,2,3,4,5,6,7,8,9,4,10,11,12,13,4,14,15,4};
        int k = 49;
        boolean mare = true;
        for (int el : lista){
            if (el > k){
                mare = false;
                break;
            }
        }
        if (mare){
            System.out.println("Elementul " + k + " este mai mare ca toate elementele listei.");
        } else{
            System.out.println("Elementul " + k + " nu este mai mare.");
        }*/

        // se dau doua array-uri. Sa se afiseze daca suma elementelor din fiecare array este mai mare ca cealalta
        /* int[] lista = {1,2,3,4,5,6,7,8,9,4,10,1,2,3,4,14,15,4};
         int[] lista2 = {1,2,3,4,2,2,9,50,6,5,4,13,1};
         int suma1 = 0;
         int suma2 = 0;
         // parcurgem prima lista si aflam suma elem
        for (int el: lista){
            suma1 += el;
        }
         // parcurgem a doua lista is aflam suma elem
        for (int el2: lista2){
            suma2 += el2;
        }
         // comparam cele doua sume
        if (suma1 == suma2){
            System.out.println("Sumele sunt egale " + suma1 + " == " + suma2);
        } else {
            System.out.println("Sumele nu sunt egale " + suma1 + " <> " + suma2);
        }*/

    }
}
