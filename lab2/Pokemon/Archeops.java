package Pokemon;
import ru.ifmo.se.pokemon.*;
import Move.*;

public class Archeops extends Archen{

	public double last_damage = 0;
	public Archeops(String name, int level){
		super(name, level);
		setStats(75, 140, 65, 112, 65, 110);
		setType(Type.ROCK, Type.FLYING);
		setMove(new RockTomb(), new QuickAttack(), new AncientPower(), new FocusBlast());
	}
}
