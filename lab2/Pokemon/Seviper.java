package Pokemon;
import ru.ifmo.se.pokemon.*;
import Move.*;

public class Seviper extends Pokemon{

	public double last_damage = 0;
	public Seviper(String name, int level){
		super(name, level);
		setStats(73, 100, 60, 100, 60, 65);
		setType(Type.POISON);
		setMove(new Glare(), new VenomDrench(), new Swagger(), new PoisonTail());
	}
}
