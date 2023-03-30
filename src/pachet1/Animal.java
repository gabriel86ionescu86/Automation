package pachet1;

class Animal {
    public String nume;
    public char sex;
    public double greutate;
    protected String tipAnimal;
    protected int age;
    protected void scoateSunet(){}
    protected void estePrietenos(){}
}

class Caine extends Animal{
    public String tipAnimal = "Catel";
    public int age = 4;
    public void scoateSunet(){
        System.out.println("Ham-Ham!");
    }
}

class cainePrietenos extends Caine{
    public void estePrietenos(){
        System.out.println("Este foarte prietenos si nu musca.");
    }
}
class caineNeprietenos extends Caine{
    public void nuEstePrietenos(){
        System.out.println("Atentie, acest caine musca!");
    }
}

class Pisica extends Animal {
    public String tipAnimal = "Pisica";
    int age = 4;
    public void scoateSunet() {
        System.out.println("Miau!");
    }
    public void estePrietenos(){
        System.out.println("Atentie zgarie! Nu insistati cu mangaierile");
    }

    public static void main(String[] args) {
        /*Caine catel1 = new Caine();
        catel1.nume = "Scooby";
        catel1.sex = 'M';
        catel1.greutate = 10.2;
        System.out.println(catel1.tipAnimal + " " + catel1.nume + " are " + catel1.age +"ani, " + catel1.greutate + "kg si este de sex " + catel1.sex);
        catel1.scoateSunet();
        catel1.estePrietenos();//*/

        cainePrietenos catel2 = new cainePrietenos();
        catel2.nume = "Azorel";
        System.out.println("Cum este " + catel2.nume);
        catel2.estePrietenos();


        caineNeprietenos catel3 = new caineNeprietenos();
        catel3.nume = "Azorel";
        System.out.println("Cum este " + catel3.nume);
        catel3.nuEstePrietenos();

       /* System.out.println("---------------------------");
        Pisica pisica1 = new Pisica();
        pisica1.nume = "Luna";
        pisica1.sex = 'F';
        pisica1.greutate = 3.2;
        System.out.println(pisica1.tipAnimal+ " " + pisica1.nume + " are " +pisica1.age + "ani,  " + pisica1.greutate + "kg si este de sex " + pisica1.sex);
        pisica1.scoateSunet();
        pisica1.estePrietenos();*/
    }
}