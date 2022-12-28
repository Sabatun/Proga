import java.util.ArrayList;

public class Group extends SceneObject implements Groups {
    private ArrayList<Placeable> inside;

    public Group(String s) {
        super(s);
        inside = new ArrayList<Placeable>();
    }

    public void Put(Placeable obj) {
        inside.add(obj);
        obj.SetPlace(this);
        System.out.printf("Коротышка %s добавлен в группу %s\n", obj, this);
    }

    public void Remove(Placeable obj) {
        obj.SetPlace(null);
        inside.remove(obj);
        System.out.printf("Коротышка %s убран из группы %s\n", obj, this);
    }

    public void List() {
        for (int i = 0; i < inside.size(); i++) {
            if (i == 0) {
                System.out.printf("%s", inside.get(i));
            } else if (i != inside.size() - 1) {
                System.out.printf(", %s", inside.get(i));
            } else {
                System.out.printf(" и %s", inside.get(i));
            }
        }
    }

}
