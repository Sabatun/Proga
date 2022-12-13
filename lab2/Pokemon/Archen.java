package Pokemon;
import ru.ifmo.se.pokemon.*;
import Move.*;

public class Archen extends Pokemon{

	public double last_damage = 0;
	public Archen(String name, int level){
		super(name, level);
		setStats(55, 112, 45, 74, 645, 70);
		setType(Type.ROCK, Type.FLYING);
		setMove(new RockTomb(), new QuickAttack(), new AncientPower());
	}
}
