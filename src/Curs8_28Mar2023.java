public class Curs8_28Mar2023 {
    /*String model = "Dacia";
    String model2 = "Audi";
    String model3 = "BMW";
    String[] culoare = {"rosu", "oranj", "galben", "verde", "albastru", "indigo", "violet"};*/

    int x;
    public Curs8_28Mar2023(){
        x = 5;
    }
    public Curs8_28Mar2023(int xActual){
        x = xActual;
    }

    public static void main(String[] args) {
/*        Curs8_28Mar2023 masina = new Curs8_28Mar2023();
        System.out.println("Model de masina: " + masina.model + " || Culoare: " + masina.culoare[0]);
        System.out.println("Model de masina: " + masina.model2 + " || Culoare: " + masina.culoare[5]);
        System.out.println("Model de masina: " + masina.model3 + " || Culoare: " + masina.culoare[2]);*/
        /*Second obj = new Second();
        obj.mesajPublic();
        Second masina = new Second();
        masina.acceleratieFull();
        masina.viteza(200);*/

     /*   Curs8_28Mar2023 obiect = new Curs8_28Mar2023();
        System.out.println(obiect.x);*/

        // apelam clasa triunghi
       /* Triunghi triunghi1 = new Triunghi();
        System.out.println(triunghi1.latura1 + " " +triunghi1.latura2 + " " + triunghi1.latura3 +" " + triunghi1.forma);
        System.out.println("--||--");
        triunghi1.triunghi(4,5,6);*/

        Exercitiu22 ex1 = new Exercitiu22();
        System.out.println(ex1.calculeazaPerimetru(3,4));
        System.out.println(" --- ");
        System.out.println(ex1.calculeazaAria(ex1.lungime, ex1.latime));




    }

}
