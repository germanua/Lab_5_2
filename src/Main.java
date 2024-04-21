import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Create a character
        Character character = new Character(0, 0, Arrays.asList("Sword", "Shield"), 100);

        // Display initial character state
        displayCharacterState(character);

        // Change character attributes
        character.setPositionX(10);
        character.setPositionY(5);
        character.setArtifacts(Arrays.asList("Bow", "Arrows", "Health Potion"));
        character.setHealth(80);

        // Display updated character state
        displayCharacterState(character);

        // Save character state
        CharacterMemento savedState = character.saveState();
        System.out.println("Character state saved.");

        // Perform more actions on the character (not implemented in this example)

        // Restore character state
        character.restoreState(savedState);
        System.out.println("Character state restored.");

        // Display restored character state
        displayCharacterState(character);
    }

    private static void displayCharacterState(Character character) {
        System.out.println("Character state:");
        System.out.println("Position: (" + character.getPositionX() + ", " + character.getPositionY() + ")");
        System.out.println("Artifacts: " + character.getArtifacts());
        System.out.println("Health: " + character.getHealth());
        System.out.println();
    }
}
