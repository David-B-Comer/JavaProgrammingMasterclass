public class AnimalsMain {

    public static void main(String[] args) {

        Dogs dog = new Dogs("Yorkie");
        dog.breathe();
        dog.eat();

        Birds bird = new Birds("Parrot");
        bird.breathe();
        bird.eat();
    }
}
