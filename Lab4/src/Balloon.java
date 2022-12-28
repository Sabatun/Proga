import java.util.ArrayList;

public class Balloon extends Thing {
    final Composition contain;

    public Balloon(String s) {
        super(s);
        contain = new Composition("Состав шара");
    }


    public static class Composition extends Group {
        private ArrayList<Placeable> inside;

        public Composition(String s) {
            super(s);
            inside = new ArrayList<Placeable>();
        }
        @Override
        public void Put(Placeable obj) {
            inside.add(obj);
            obj.SetPlace(this);
            System.out.printf("Обьект %s добавлен в %s\n", obj, this);
        }
    }
}