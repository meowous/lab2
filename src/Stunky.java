import ru.ifmo.se.pokemon.*;

public class Stunky extends Pokemon {
    public Stunky (String name, int lvl) {
        super (name, lvl);
        setStats(63,63,47,41,41,74);
        setType(Type.POISON, Type.DARK);
        setMove(new Confide(), new IceBeam(), new Rest());
    }
}
