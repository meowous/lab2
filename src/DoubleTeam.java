import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

//Повышает уклонение пользователя на одну ступень
public class DoubleTeam extends StatusMove {
    public DoubleTeam() { super(Type.NORMAL,0,0); }

    @Override
    protected void applySelfEffects (Pokemon pokemon){
        pokemon.setMod(Stat.EVASION, 1);
    }
}
