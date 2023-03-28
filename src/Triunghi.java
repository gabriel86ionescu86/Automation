public class Triunghi {
    // atribute
    int latura1;
    int latura2;
    int latura3;
    String forma;

    // constructori
    public Triunghi(){
        latura1 = 1;
        latura2 = 1;
        latura3 = 1;
        forma = "echilateral";
    }

    public Triunghi(int latura1Actuala, int latura2Actuala, int latura3Actuala){
        latura1 = latura1Actuala;
        latura2 = latura2Actuala;
        latura3 = latura3Actuala;
    }
    // metoda
    public void triunghi(int latura1, int latura2, int latura3){
        if (((latura1+latura2) > latura3) && ((latura1+latura3) > latura2) && ((latura2+latura3) > latura1)) {
            if (latura1 == latura2 && latura2 == latura3) {
                System.out.println("Triunghiul este echilateral");
            } else if ((latura1 == latura2) || (latura2 == latura3) || (latura1 == latura3)) {
                System.out.println("Triunghiul este isoscel");
            } else if (latura1 != latura2 && latura1 != latura3 && latura2 != latura3) {
                System.out.println("Triunghiul este oarecare");
            }
        } else {
            System.out.println("Nu este un triunghi");
        }
    }


}
