import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

//Имеет 10% шанс заморозить цель
public class IceBeam extends SpecialMove {
    public IceBeam() { super(Type.ICE,90,100); }

    @Override
    protected void applyOppEffects (Pokemon p) {
        if (Math.random() < 0.1){
            Effect.freeze(p);
        }
    }
    @Override
    protected String describe() {
        return "Использует Ice Beam";
    }
}
