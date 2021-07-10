public class AnimalsMain {

    public static void main(String[] args) {

        Dogs dog = new Dogs("Yorkie");
        dog.breathe();
        dog.eat();

        Parrots parrot = new Parrots("Parrot");
        parrot.breathe();
        parrot.eat();
        parrot.fly();
    }
}
