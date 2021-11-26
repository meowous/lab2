import ru.ifmo.se.pokemon.*;

public class Vikavolt extends Charjabug {
    public  Vikavolt (String name, int lvl) {
        super (name, lvl);
        setStats(77,70,90,145,75,43);
        setType(Type.BUG, Type.ELECTRIC);
        setMove(new Facade(), new DoubleTeam(), new AquaRing(), new ShadowSneak());
    }
}
