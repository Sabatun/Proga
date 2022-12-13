package Move;
import ru.ifmo.se.pokemon.*;

public class VenomDrench extends StatusMove{
	public VenomDrench(){
		super(Type.POISON, 0, 100);
	}
	@Override
	protected void applyOppEffects(Pokemon p){
	    if (p.getCondition() == Status.POISON){
            p.setMod(Stat.ATTACK, 1);
            p.setMod(Stat.SPEED, 1);
            p.setMod(Stat.SPECIAL_ATTACK, 1);
	    }
	}
	@Override
	protected String describe(){
		return "использует VenomDrench";
	}
}
