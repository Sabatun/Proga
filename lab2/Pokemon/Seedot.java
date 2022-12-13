package Pokemon;
import ru.ifmo.se.pokemon.*;
import Move.*;

public class Seedot extends Pokemon{

	public double last_damage = 0;
	public Seedot(String name, int level){
		super(name, level);
		setStats(40, 40, 50, 30, 30, 30);
		setType(Type.GRASS);
		setMove(new Confide(), new DoubleTeam());
	}
}
