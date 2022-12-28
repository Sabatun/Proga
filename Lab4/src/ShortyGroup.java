import java.util.ArrayList;

public class ShortyGroup extends Group implements Loveable, Listenble, Bringable, Thinkable {
    private ArrayList<Placeable> inside;

    public ShortyGroup(String s) {
        super(s);
        inside = new ArrayList<Placeable>();
    }

    public void Listen(Shorty t) {
        System.out.printf("%s слушают рассказы %s \n", toString(), t);
    }

    public void DreamAndListen(SceneObject s) {
        System.out.printf("Наслушавшись таких %s, %s стали мечтать о том, как бы самим отправиться в путешествие \n", s, toString());
    }

    public void Like(LikeType s, Thing t) {
        System.out.printf("%s %s %s \n", toString(), s, t);
    }

    public void MostLovely(LikeType s, Thing t) {
        System.out.printf("Но %s %s слушать о %s, так как с путешественниками случаются разные невероятные истории и бывают самые необыкновенные приключения. \n", toString(), s, t);
    }

    public void Interested(LikeType s, Thing t) {
        System.out.printf("%s никогда не летали на %s, и всем %s это %s\n", toString(), t, toString(), s);
    }

    public void Bring(BringType s, SceneObject t, SceneObject d) {
        super.List();
        System.out.printf(" %s %s и понесли в %s \n", s, t, d);
    }

    public void Think(ThinkType s, SceneObject t) {
        System.out.printf("%s думали, что %s %s \n", toString(), t, s);
    }

    public void GroupPut(BringType s, SceneObject t, SceneObject d) {
        System.out.printf("Дома %s %s %s на %s \n", toString(), s, t, d);
    }

    public void Extract(Thing s, Flower t) throws Exceptions.ExistException {
        if (t.isFlower) {
            System.out.printf("К счастью %s могли добывать %s из %s \n", toString(), s, t);
        } else {
            throw new Exceptions.ExistException("К сожалению, " + toString() + " не могли добыть " + s + " из " + t + ", так как " + t + " у них не росли \n");
        }
    }


}
