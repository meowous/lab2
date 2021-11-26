import ru.ifmo.se.pokemon.*;

public class Necrozma extends Pokemon {
    public Necrozma (String name, int lvl) {
        super (name, lvl);
        setStats(97,107,101,127,89,79);
        setType(Type.PSYCHIC);
        setMove(new Thunder(), new Thunderbolt(), new Facade(), new Overheat());
    }
}
