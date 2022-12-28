public class Thing extends SceneObject implements Placeable {
    private SceneObject place;

    public Thing(String s) {
        super(s);
    }

    public void SetPlace(SceneObject obj) {
        place = obj;
    }
}
