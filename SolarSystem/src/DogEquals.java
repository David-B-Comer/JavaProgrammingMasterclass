public class DogEquals {

    private final String name;

    public DogEquals(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public final boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj instanceof DogEquals) {

            String objName = ((DogEquals) obj).getName();

            return this.name.equals(objName);
        }
        return false;
    }

}
