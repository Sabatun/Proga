public class ShortyGroup extends SceneObject implements Loveable, Listenble{
    public ShortyGroup(String s) {
        super(s);
    }

    private Placeable inside;

    public void Put(Placeable obj) {
        inside = obj;
        inside.SetPlace(this);
        System.out.printf("Коротышка %s добавлен в группу %s\n", inside, this);
    }

    public void Listen(Shorty t) {
        System.out.printf("%s слушают рассказы %s \n", toString(), t);
    }

    public void Like(LikeType s, Thing t) {
        System.out.printf("%s %s %s \n", toString(), s, t);
    }
    public void MostLovely(LikeType s, Thing t) {
        System.out.printf("Но %s %s слушать о %s, так как с путешественниками случаются разные невероятные истории и бывают самые необыкновенные приключения. \n", toString(), s, t);
    }
}
