public class Main {
    public static void main(String[] args) throws Exceptions.ScenarioException {
        try {

            Shorty NoZnaika = new Shorty("Незнайка");
            Shorty Gunka = new Shorty("Гунька");
            Shorty Pilulkin = new Shorty("Доктор Пилюлькин");
            Shorty Avoska = new Shorty("Авоська");
            Shorty Vintik = new Shorty("Винтик");
            Shorty Znaika = new Shorty("Знайка");

            System.out.printf("\n");

            ShortyGroup Malishi = new ShortyGroup("Малыши");
            Malishi.Put(Znaika);
            Malishi.Put(Avoska);
            Malishi.Put(Vintik);
            Malishi.Put(Pilulkin);

            System.out.printf("\n");

            Thing home = new Thing("дом");
            Thing bed = new Thing("кровать");
            Malishi.Bring(BringType.GRAB, NoZnaika, home);
            Malishi.Think(ThinkType.BAD, NoZnaika);
            Malishi.GroupPut(BringType.PUT, NoZnaika, bed);


            System.out.printf("\n");

            Thing window = new Thing("открытое окно");
            Thing temper = new Thing("градусником");

            System.out.printf("\n");

            NoZnaika.MoveWith(MoveType.STAY, bed);
            NoZnaika.MoveWith(MoveType.JUMP, window);
            NoZnaika.MoveWhom(MoveType.RUN, Gunka);
            Pilulkin.MoveWith(MoveType.RETURN, temper);
            Pilulkin.LookNoSee(NoZnaika);

            System.out.printf("\n");

            Thing book = new Thing("книжках");

            System.out.printf("\n");

            Znaika.Read(book);
            Thing story = new Thing("рассказы");
            Thing countries = new Thing("странах");
            Thing traveler = new Thing("путешественниках");

            System.out.printf("\n");

            Znaika.Say(book);

            System.out.printf("\n");


            Malishi.Remove(Znaika);
            Malishi.Put(NoZnaika);
            Malishi.Put(Gunka);

            System.out.printf("\n");

            Malishi.Listen(Znaika);
            Malishi.Like(LikeType.LOVE, story);
            Malishi.Like(LikeType.LIKE, countries);
            Malishi.MostLovely(LikeType.MORELIKE, traveler);
            Malishi.DreamAndListen(story);

            System.out.printf("\n");
            Balloon balloon = new Balloon("Воздушный шар");
            Znaika.Suggest(balloon);

            System.out.printf("\n");

            Malishi.Put(Znaika);
            Malishi.Interested(LikeType.INTEREST, balloon);

            System.out.printf("\n");

            Znaika.Know(KnowType.THINK, balloon);
            Thing resina = new Thing("Резина");
            Znaika.Think(KnowType.KNOW, balloon, resina);

            System.out.printf("\n");

            balloon.contain.Put(resina);
            Flower fikus = new Flower("цветы, похожие на фикусы");

            System.out.printf("\n");

            //fikus.create();

            Malishi.Extract(resina, fikus);

            System.out.printf("\n");

            //анонимный класс
            class FlowerInf{
                void Information() {
                    System.out.print("Если на стебле такого цветка сделать надрез, то из него начинает вытекать белый сок. Этот сок постепенно густеет и превращается в резину, из которой можно делать мячи и калоши. \n");
                }
            }
            FlowerInf ResinaExtrain = new FlowerInf();
            ResinaExtrain.Information();


        } catch (Exception e) {
            System.err.println(e.getMessage());
            throw new Exceptions.ScenarioException();
        } finally {
            System.out.println("конец");
        }
    }
}