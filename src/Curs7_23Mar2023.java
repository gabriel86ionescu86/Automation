import java.util.Scanner;

public class Curs7_23Mar2023 {
    public static void main(String[] args) {
        // recapitulare

        // Sa se afiseze in functie de ora in felul urmator:
        //pana in ora 10 dimineata => buna dimineata
        //pana in ora 18 => buna ziua
        //dupa ora 18 => buna seara

        /*int nr = 11;
        boolean estePrim = true;
        for(int i=2; i<=nr/2; i++){
            if(nr % i == 0){
                estePrim = false;
                break;
            }
        }
        if(estePrim){
            System.out.println("Numarul " + nr + " este prim");
        } else {
            System.out.println("Numarul " + nr + " nu este prim");

        }*/

        /*//scrieti un program folosind while ce primeste o var 10 si afiseaza toate nr pana la 10
        // si suma lor
        int nr = 1;
        int suma = 0;
        while (nr <= 10){
            suma +=nr;
            System.out.print(nr + " ");
            nr++;
        }
        System.out.println();
        System.out.println("Suma numerelor este: " + suma);*/

        Scanner input = new Scanner(System.in);
        // float
        /*System.out.print("Enter float: ");
        float floatNr = input.nextFloat();
        System.out.println("Ai introdus: " + floatNr);*/
        // double
        /*System.out.print("Enter double: ");
        double doubleNr = input.nextDouble();
        System.out.println("Ai introdus: " + doubleNr);*/
        // int
        /*System.out.print("Enter int: ");
        int intNr = input.nextInt();
        System.out.println("Ai introdus: " + intNr);*/
        // string pt primul cuvant
        /*System.out.print("Enter string: ");
        String stringNr = input.next();
        System.out.println("Ai introdus: " + stringNr);*/
        // string pt fraze
        System.out.print("Enter string: ");
        String stringNr = input.nextLine();
        System.out.println("Ai introdus: " + stringNr);
    }
}
