package Move;
import ru.ifmo.se.pokemon.*;

public class PoisonTail extends PhysicalMove{
	public PoisonTail(){
		super(Type.POISON, 50, 100);
	}
    @Override
	protected void applyOppEffects(Pokemon def){
        Effect.poison(def);
	}
	@Override
	protected String describe(){
		return "использует PoisonTail";
	}
}
