public class Flower extends Thing {
    boolean isFlower = false;
    private String Name;

    public Flower(String s) {
        super(s);
    }

    public void create() {
        System.out.printf("обьект %s растет в городе \n", toString());
        this.isFlower = true;
    }

}
