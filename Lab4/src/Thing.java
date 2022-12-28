import java.util.ArrayList;

public class Thing extends SceneObject implements Placeable {
    private SceneObject place;

    public Thing(String s) {
        super(s);
    }

    public void SetPlace(SceneObject obj) {
        place = obj;
    }

    class Contain{
        ArrayList<String> inside;

        public Contain() {
            inside = new ArrayList<String>();
        }

        public void Put(String obj) {
            inside.add(obj);
            System.out.printf("Коротышка %s добавлен в группу %s\n", obj, this);
        }

        public void Remove(String obj) {
            inside.remove(obj);
            System.out.printf("Коротышка %s убран из группы %s\n", obj, this);
        }
    }
    Contain heroes = new Contain();
}
