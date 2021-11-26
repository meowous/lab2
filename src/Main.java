import ru.ifmo.se.pokemon.Battle;

public class Main {
    public static void main(String[] args) {

        Battle btl = new Battle();

        btl.addAlly(new Necrozma("Никита", 1));
        btl.addAlly(new Stunky("Стас", 1));
        btl.addAlly(new Skuntank("Стасян", 1));

        btl.addFoe(new Grubbin("Галя", 1));
        btl.addFoe(new Charjabug("Галина", 1));
        btl.addFoe(new Vikavolt("Галина Викторовна", 1));

        btl.go();
    }
}
