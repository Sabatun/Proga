public class Shorty extends LifeObject implements Placeable, Readable, Moveble, Lookable, Speaking {

    private SceneObject place;

    public void MoveWith(MoveType s, Thing t) {
        System.out.printf("Коротышка %s %s %s \n", toString(), s, t);
    }

    public void MoveWhom(MoveType s, Shorty t) {
        System.out.printf("Коротышка %s %s своему другу по имени %s \n", toString(), s, t);
    }

    public void Read(Thing t) {
        System.out.printf("Коротышка %s, который очень любил читать, начитался в %s о дальних странах и разных путешествиях. \n", toString(), t);
    }

    public void Say(Thing t) {
        System.out.printf("Часто, когда вечером нечего было делать, коротышка %s рассказывал своим друзьям о том, что читал в %s. \n", toString(), t);
    }

    public void LookNoSee(Shorty s) {
        System.out.printf("Коротышка %s смотрит и не видит коротышку по имени %s \n", toString(), s);
    }


    public Shorty(String s) {
        super(s);
    }

    public void SetPlace(SceneObject obj) {
        place = obj;
    }
}
