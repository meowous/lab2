import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

//Наносит обычные повреждения без дополнительного эффекта
public class WaterGun extends SpecialMove {
    public WaterGun() { super(Type.WATER,40,100); }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        pokemon.setMod(Stat.HP, (int)v);
    }

    @Override
    protected String describe() {
        return "Использует Water Gun";
    }
}
