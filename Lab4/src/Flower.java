import java.util.ArrayList;

public class Flower extends Thing {
    boolean isFlower = false;
    private String Name;
    ArrayList<String> special;


    public Flower(String s) {
        super(s);

        class FlowerType{

            ArrayList<String> Name;

            FlowerType() {
                Name = new ArrayList<String>();
                Name.add("Фикусы");
                Name.add("Розы");
                Name.add("Фиалки");
            }
        }
        FlowerType types = new FlowerType();
        special = types.Name;
    }

    public void create() {
        System.out.printf("обьект %s растет в городе \n", toString());
        this.isFlower = true;

    }


}
