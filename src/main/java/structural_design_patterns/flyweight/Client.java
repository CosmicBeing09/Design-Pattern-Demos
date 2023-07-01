package structural_design_patterns.flyweight;

public class Client {
    public static void main(String[] args) {
        Character character1 = CharacterFactory.getCharacter("Warrior");
        character1.display("Sword");

        Character character2 = CharacterFactory.getCharacter("Mage");
        character2.display("Staff");

        Character character3 = CharacterFactory.getCharacter("Warrior");
        character3.display("Axe");
    }
}
