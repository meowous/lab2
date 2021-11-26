import ru.ifmo.se.pokemon.*;

public class Charjabug extends Grubbin {
    public  Charjabug (String name, int lvl) {
        super (name, lvl);
        setStats(57,82,95,55,75,36);
        setType(Type.BUG, Type.ELECTRIC);
        setMove(new Facade(), new DoubleTeam(), new AquaRing());
    }
}
