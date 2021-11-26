import ru.ifmo.se.pokemon.*;

//Имеет 10% шанс парализовать цель
public class Thunderbolt extends SpecialMove {
    public Thunderbolt() { super(Type.ELECTRIC,90,100); }

    protected void applyOppEffects (Pokemon p) {
        if (Math.random() < 0.1){
            Effect e = new Effect();
            e.condition(Status.PARALYZE);
            p.setCondition(e);
        }
    }
}


