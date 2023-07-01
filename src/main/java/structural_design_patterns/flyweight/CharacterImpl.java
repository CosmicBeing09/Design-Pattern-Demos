package structural_design_patterns.flyweight;

public class CharacterImpl implements Character{
    private String type;

    public CharacterImpl(String type) {
        this.type = type;
    }

    @Override
    public void display(String weapon) {
        System.out.println("Character type: " + type + ", Weapon: " + weapon);
    }
}
