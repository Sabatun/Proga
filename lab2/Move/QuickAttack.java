package Move;
import ru.ifmo.se.pokemon.*;

public class QuickAttack extends PhysicalMove{
	public QuickAttack(){
		super(Type.NORMAL, 40, 100, 1, 1);
	}
	@Override
	protected String describe(){
		return "���������� QuickAttack";
	}
}
