package Pokemon;
import ru.ifmo.se.pokemon.*;
import Move.*;

public class Shiftry extends Nuzleaf{

	public double last_damage = 0;
	public Shiftry(String name, int level){
		super(name, level);
		setStats(90, 100, 60, 90, 60, 80);
		setType(Type.GRASS, Type.DARK);
		setMove(new Confide(), new DoubleTeam(), new LeafBlade(), new RazorLeaf());
	}
}
