import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

//Имеет 30% шанс парализовать цель
public class Thunder extends SpecialMove {
    public Thunder() { super(Type.ELECTRIC, 110, 70); }


    @Override
    protected void applyOppEffects (Pokemon p) {
        if (Math.random() < 0.3){
            Effect e = new Effect();
            e.condition(Status.PARALYZE);
            p.setCondition(e);
        }
    }

    @Override
    protected String describe() {
        return "Использует Thunder";
    }
}
