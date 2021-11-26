import ru.ifmo.se.pokemon.*;

public class Grubbin extends Pokemon {
    public Grubbin (String name, int lvl) {
        super (name, lvl);
        setStats(47,62,45,55,45,46);
        setType(Type.BUG);
        setMove(new Facade(), new DoubleTeam());
    }
}


