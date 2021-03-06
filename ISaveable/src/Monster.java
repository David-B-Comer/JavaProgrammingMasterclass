import java.util.LinkedList;
import java.util.List;

public class Monster implements ISaveable {

    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public List<String> write() {

        List<String>values = new LinkedList<>();

        values.add(this.name);
        values.add(String.valueOf(this.hitPoints));
        values.add(String.valueOf(this.strength));

        return values;
    }

    @Override
    public void read(List<String> list) {

        if (list != null && list.size() > 0) {
            this.name = list.get(0);
            this.hitPoints = Integer.parseInt(list.get(1));
            this.strength = Integer.parseInt(list.get(2));
        }
    }

    @Override
    public String toString() {
        return "Monster{name='" + name + '\'' + ", hitPoints=" + hitPoints + ", strength=" + strength + "}";
    }
}
