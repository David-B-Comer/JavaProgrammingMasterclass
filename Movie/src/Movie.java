public class Movie {

    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here";
    }
}


class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }
}