import  java.lang.reflect.*;
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
            story.heroes.Put("путешественниках");
            story.heroes.Put("путешественниками");
            story.heroes.Put("приключения");
            story.heroes.Put("путешествие");
            story.heroes.Put("странах");

            System.out.printf("\n");

            Znaika.Say(book);

            System.out.printf("\n");


            Malishi.Remove(Znaika);
            Malishi.Put(NoZnaika);
            Malishi.Put(Gunka);

            System.out.printf("\n");

            Malishi.Listen(Znaika, story);
            Malishi.Like(LikeType.LOVE, story);
            Malishi.Like(LikeType.LIKE, story);
            Malishi.MostLovely(LikeType.MORELIKE, story);
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
            Flower fikus = new Flower("цветы");

            System.out.printf("\n");

            //fikus.create();

            Malishi.Extract(resina, fikus);

            System.out.printf("\n");

            Info ResinaExtrain = new Info(){
            @Override
                public void information() {
                    System.out.print("Если на стебле такого цветка сделать надрез, то из него начинает вытекать белый сок. Этот сок постепенно густеет и превращается в резину, из которой можно делать мячи и калоши. \n");
                }
            };

            ResinaExtrain.information();



        } catch(Exception e) {
            System.err.println(e.getMessage());
            throw new Exceptions.ScenarioException();
        } finally {
            System.out.println("конец");
        }
    }
}

/*
Знайка, Авоська, Винтик и доктор Пилюлькин схватили Незнайку и понесли домой. Все думали, что он уже мертвый. Дома его положили на кровать, и
только тут Незнайка открыл глаза. Он поглядел по сторонам и спросил: Он раздел Незнайку и стал осматривать. Потом сказал: Незнайка вскочил с
кровати, выпрыгнул в открытое окно и убежал к своему другу Гуньке. Доктор Пилюлькин вернулся с градусником, смотрит -- Незнайки нет. Знайка,
который очень любил читать, начитался в книжках о дальних странах и разных путешествиях. Часто, когда вечером нечего было делать, он
рассказывал своим друзьям о том, что читал в книжках. Малыши очень любили эти рассказы. Им нравилось слушать о странах, которых они ни разу
не видели, но больше всего они любили слушать о путешественниках, так как с путешественниками случаются разные невероятные истории и бывают
самые необыкновенные приключения. Наслушавшись таких историй, малыши стали мечтать о том, как бы самим отправиться в путешествие.
Некоторые предлагали совершить пеший поход, другие предлагали плыть по реке на лодках, а Знайка сказал: Эта затея всем очень понравилась.
Коротышки еще никогда не летали на воздушном шаре, и всем малышам это было очень интересно. Никто, конечно, не знал, как делать воздушные
шары, но Знайка сказал, что он все обдумает и тогда объяснит. И вот Знайка стал думать. Думал он три дня и три ночи и придумал сделать шар из
резины. Коротышки умели добывать резину. В городе у них росли цветы, похожие на фикусы. Если на стебле такого цветка сделать надрез, то из него
начинает вытекать белый сок. Этот сок постепенно густеет и превращается в резину, из которой можно делать мячи и калоши.

*/
interface Info{
    void information();
}