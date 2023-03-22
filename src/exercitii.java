public class exercitii {
    public static void main(String[] args) {
        //test
//        System.out.println((int)Math.pow(2,10));
//        System.out.println((int)Math.sqrt(100));
//        System.out.println((double) Math.min(10,11));
//        System.out.println(Math.max(12,10));
//
//        double a = 2.3345534534534556;
////        System.out.println(Math.round(a));
//        System.out.println(String.format("%.7f", a));

//        int[] primulArray = {1, 7, 11, 13 , 17, 21};
//        boolean existaNrPar = false;
//        boolean estePrim = true;
//        for (int i = 0; i < primulArray.length; i++) {
//            if (primulArray[i] % 2 == 0) {
//                existaNrPar = true;
//                break;
//            }
//        }
//
//        for (int el : primulArray){
//            for(int j = 2; j < el; j++){
//                if (el % j == 0){
//                    estePrim = false;
//                }
//            }
//        }
//        System.out.println("Lista contine elemente pare " + existaNrPar);
//        System.out.println("Lista contine elemente prime " + estePrim);

        int[] lista = {35,22,55,63,23,51,15,17,8,35,85,52};
        int min = lista[0];
        for (int el: lista){
            if (el < min){
                min = el;
            }
        }
        System.out.println(min);



    }
}
