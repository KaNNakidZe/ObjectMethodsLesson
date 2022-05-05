package KaNNaT.first;

public class Main {

    public static void main(String[] args) {
        PersonServis personServis = new PersonServis();
        Person sarah = new Person("Sarah", 30);
        if (personServis.isAdult(sarah)) {
            System.out.println("Go to the bar");
        } else {
            System.out.println("Go to school");
        }
        System.out.println(sarah);
        sarah.increaseAge(-25);

    }
}
