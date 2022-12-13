package Move;
import ru.ifmo.se.pokemon.*;

public class LeafBlade extends PhysicalMove{
	public LeafBlade(){
		super(Type.GRASS, 90, 100);
	}
	@Override
	protected String describe(){
		return "использует LeafBlade";
	}
}
