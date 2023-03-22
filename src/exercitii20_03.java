public class exercitii20_03 {
    public static void main(String[] args) {
        // exercitii matrici bidimensionale
//        int[][] matrice = {{18,4}, {7,8},{9,15}};
        // cu for normal
        /*for(int i = 0; i< matrice.length;i++){
            for(int j = 0;j <matrice[i].length; j++){
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }*/
        // cu enhanced for
        /*for(int[] array: matrice){
            for(int el: array){
                System.out.print(el + " ");
            }
            System.out.println();
        }*/

        /*// sa se calculeze suma elementelor unei matrice
        int suma = 0;
        for(int i = 0; i< matrice.length; i++){
            for (int j = 0; j < matrice[i].length; j++){
                suma += matrice[i][j];
            }
        }
        System.out.println("Suma elementelor matricei este: " + suma);*/

        /*// sa se inlocuiasca fiercare element impar cu 0 si sa se afiseze noua matrice
        for(int[] array : matrice){
            for(int el : array){
                System.out.print(el + " ");
            }
            System.out.println();
        }
        for(int i = 0; i< matrice.length; i++){
            for(int j = 0; j< matrice[i].length; j++){
                if(matrice[i][j] %  2 != 0){
                    matrice[i][j] = 0;
                }
            }
        }
        System.out.println("==========================");
        for(int[] array : matrice){
            for(int el : array){
                System.out.print(el + " ");
            }
            System.out.println();
        }*/

        // scrie un program care verifica daca o matrice contine cel putin un nr prim
        /*int[][] matrice = {{12,4}, {16,8},{12,29}};
        boolean estePrim = false;
        for(int i = 0; i < matrice.length; i++){
            for(int j = 0; j < matrice[i].length; j++){
                estePrim = true;
                for(int k = 2; k < matrice[i][j]; k++){
                    if(matrice[i][j] % k == 0){
                        estePrim = false;
                        break;
                    }
                }
                if (estePrim){
                    break;
                }
            }
            if (estePrim){
                break;
            }
        }
        if (estePrim){
            System.out.println("Matricea contine numere prime");
        } else {
            System.out.println("Matricea nu contine numere prime");
        }*/

        // sa se scrie un program care verifica daca o matrice contine cel putin un nr par
        /*int[][] matrice2 = {{11,4}, {44,81},{784,151}};
        boolean estePar = true;
        for(int[] array : matrice2){
            for(int el: array){
                if(el % 2 == 0){
                    estePar = false;
                    break;
                }
            }
        }
        if (estePar){
            System.out.println("Maticea nu contine cel putin un nr par");
        } else {
            System.out.println("Matricea contine cel putin un nr par");
        }*/

        // sa se afizese primul element multiplu de 7 din matrice
        /*int element = 0;
        boolean elementGasit = false;
        for(int[] array : matrice2){
            for(int el : array){
                if(el%7 == 0){
                    element = el;
                    elementGasit = true;
                    break;
                }
            }
        }
        if (elementGasit){
            System.out.println("Elementul " + element + " a fost gasit ca multiplu de 7: "
                    + element + " / 7 = " + (element/7));
        }*/

        // sa se scrie o metoda care determina valoarea maxima dintr-o matrice
        /*int[][] matrice3 = {{11,4}, {44,-81},{-84,-151}};
        int max = matrice3[0][0];
        System.out.println(max);
        for(int[] array : matrice3){
            for(int el : array){
                if(el > max){
                    max = el;
                }
            }
        }
        System.out.println("Elementul maxim din matrice este: " + max);*/

    }
}
