public class DogEquals {

    private final String name;

    public DogEquals(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj instanceof Dog) {

            String objName = ((Dog) obj).getName();

            return this.name.equals(objName);
        }
        return false;
    }

}