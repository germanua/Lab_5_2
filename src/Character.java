import java.util.ArrayList;
import java.util.List;

public class Character {
    private int positionX;
    private int positionY;
    private List<String> artifacts;
    private int health;

    // Constructor
    public Character(int positionX, int positionY, List<String> artifacts, int health) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.artifacts = new ArrayList<>(artifacts);
        this.health = health;
    }

    // Getters and setters
    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public List<String> getArtifacts() {
        return new ArrayList<>(artifacts);
    }

    public void setArtifacts(List<String> artifacts) {
        this.artifacts = new ArrayList<>(artifacts);
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    // Method to save character state
    public CharacterMemento saveState() {
        return new CharacterMemento(positionX, positionY, artifacts, health);
    }

    // Method to restore character state
    public void restoreState(CharacterMemento memento) {
        this.positionX = memento.getPositionX();
        this.positionY = memento.getPositionY();
        this.artifacts = memento.getArtifacts();
        this.health = memento.getHealth();
    }

    // Other methods for character actions, such as moving, collecting artifacts, etc.
}
