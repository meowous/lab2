import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

//Мощность удваивается, если получен ожог, паралич или отравление
public class Facade extends PhysicalMove {
    public Facade() { super(Type.NORMAL, 70, 100); }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        Status enemy = pokemon.getCondition();
        if (enemy.equals(Status.BURN) || enemy.equals(Status.PARALYZE) || enemy.equals(Status.POISON)) {
            pokemon.setMod(Stat.HP, (int) v * 2);
        } else {
            pokemon.setMod(Stat.HP, (int) v);
        }
    }

    @Override
    protected String describe() {
        return "Использует Facade";
    }
}
