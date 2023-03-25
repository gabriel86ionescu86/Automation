public class exercitii25_03 {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.nume + " " + person.varsta + " ani " + person.inaltime +"h");
        Person gabriel = new Person("Alex", 23, 1.84);
        System.out.println(gabriel.nume + " " + gabriel.varsta + " ani " + gabriel.inaltime + "h");

        Pisica scooby = new Pisica();
        System.out.println(scooby.nume + " " + scooby.greutate + "g " + scooby.varsta + " ani");
        Pisica luna = new Pisica(4, 3.1, "Luna");
        System.out.println(luna.nume + " " + luna.greutate + "g " + luna.varsta + " ani");

        Dreptunghi dreptunghi = new Dreptunghi();
        System.out.println(dreptunghi.latime + " l " + dreptunghi.lungime + " L " + dreptunghi.culoare);
        Dreptunghi altDreptunghi = new Dreptunghi(5,8,"albastru");
        System.out.println(altDreptunghi.latime + " l " + altDreptunghi.lungime + " L " + altDreptunghi.culoare);


    }
}
