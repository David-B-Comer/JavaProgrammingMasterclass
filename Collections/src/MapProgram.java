import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {

        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "a compiled high level, object-orientated, platform independent language");
        languages.put("Python", "an interpreted, object-orientated, high level programming language with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        languages.put("BASIC", "Beginners All Purposes Symbolic Instruction Code");
        languages.put("Lisp", "Therein lies madness");

        System.out.println(languages.get("Java"));

        if (languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "this course is about Java");
        }


        System.out.println("==================================");

        for (String key : languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }
    }
}
