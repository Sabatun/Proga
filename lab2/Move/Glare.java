package Move;
import ru.ifmo.se.pokemon.*;

public class Glare extends StatusMove{
	public Glare(){
		super(Type.NORMAL, 0, 100);
	}
	@Override
	protected void applyOppEffects(Pokemon def){
		Effect.paralyze(def);
	}
	@Override
	protected String describe(){
		return "использует Glare";
	}
}
