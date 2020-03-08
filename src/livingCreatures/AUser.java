package livingCreatures;

import enums.Locations;
import enums.Race;
import enums.Type;

public abstract class AUser extends ALivingCreatures {
    private Race race;
    private Type type;
    private float protection;

    public AUser(String name, Race race, Type type, float health, float strength, float protection, float agility) {
        super(name, health, strength, protection, agility);
        this.race = race;
        this.type = type;
    }

    public Race getRace() {
        return this.race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public Type getType() {
        return this.type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
