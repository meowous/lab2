import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

//Снижает специальную атаку пользователя на два уровня после нанесения урона
public class Overheat extends SpecialMove {
    public Overheat() { super(Type.FIRE, 130, 90); }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.SPECIAL_ATTACK,-2);
        }


    @Override
    protected String describe() {
        return "Использует Overheat";
    }
}
