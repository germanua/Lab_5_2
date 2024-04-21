import java.util.ArrayList;
import java.util.List;

public class CharacterMemento {
    private int positionX;
    private int positionY;
    private List<String> artifacts;
    private int health;

    public CharacterMemento(int positionX, int positionY, List<String> artifacts, int health) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.artifacts = new ArrayList<>(artifacts);
        this.health = health;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public List<String> getArtifacts() {
        return new ArrayList<>(artifacts);
    }

    public int getHealth() {
        return health;
    }
}
