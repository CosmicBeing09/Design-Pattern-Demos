package structural_design_patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private static final Map<String, Character> characterCache = new HashMap<>();

    public static Character getCharacter(String type) {
        Character character = characterCache.get(type);

        if (character == null) {
            character = new CharacterImpl(type);
            characterCache.put(type, character);
        }

        return character;
    }
}
