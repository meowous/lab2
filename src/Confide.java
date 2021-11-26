import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

//Снижает специальную атаку цели на один уровень
public class Confide extends StatusMove {
    public Confide() { super(Type.NORMAL,0,0); }

    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        return true;
    }

    protected void applyOppEffects (Pokemon p) {
        p.setMod(Stat.SPECIAL_ATTACK,-1);
    }

    @Override
    protected String describe() {
        return "Использует Confide";
    }

}
