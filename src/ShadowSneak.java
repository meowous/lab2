import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

//Наносит обычные повреждения без дополнительного эффекта
public class ShadowSneak extends PhysicalMove {
    public ShadowSneak() { super(Type.GHOST,40,100); }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        pokemon.setMod(Stat.HP, (int)v);
    }

    @Override
    protected String describe() {
        return "Использует Shadow Sneak";
    }
}
