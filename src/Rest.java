import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

//Пользователь спит два хода, полностью исцеляясь
public class  Rest extends StatusMove {
    public Rest() { super(Type.PSYCHIC, 0,0); }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        Effect.sleep(pokemon);
        pokemon.setMod(Stat.HP, (int)(-(pokemon.getStat(Stat.HP))));

    }

    @Override
    protected String describe() {
        return "Использует Rest";
    }
}
