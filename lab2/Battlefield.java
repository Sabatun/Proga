import ru.ifmo.se.pokemon.*;
import Pokemon.*;

public class Battlefield {
	public static void main(String args[]) {
		Battle field = new Battle();
		field.addAlly(new Seviper("Seviper", 48));
		field.addAlly(new Archeops("Archeops", 48));
		field.addAlly(new Seedot("Seedot", 20));
		field.addFoe(new Nuzleaf("Nuzleaf", 34));
		field.addFoe(new Archen("Archen", 35));
		field.addFoe(new Shiftry("Shiftry", 48));
		field.go();
	}
}
