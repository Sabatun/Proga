public class Main {
    public static void main(String[] args) throws Exception {
        Shorty NoZnaika = new Shorty("Незнайка");
        Shorty Gunka = new Shorty("Гунька");
        Shorty Pilulkin = new Shorty("Доктор Пилюлькин");

        System.out.printf("\n");

        Thing bed = new Thing("кровати");
        Thing window = new Thing("открытое окно");
        Thing temper = new Thing("градусником");

        System.out.printf("\n");

        NoZnaika.MoveWith(MoveType.STAY, bed);
        NoZnaika.MoveWith(MoveType.JUMP, window);
        NoZnaika.MoveWhom(MoveType.RUN, Gunka);
        Pilulkin.MoveWith(MoveType.RETURN, temper);
        Pilulkin.LookNoSee(NoZnaika);

        System.out.printf("\n");

        Shorty Znaika = new Shorty("Знайка");
        Thing book = new Thing("книжках");

        System.out.printf("\n");

        Znaika.Read(book);
        Thing story = new Thing("рассказы");
        Thing countries = new Thing("странах");
        Thing traveler = new Thing("путешественниках");

        System.out.printf("\n");

        Znaika.Say(book);

        System.out.printf("\n");

        ShortyGroup Malishi = new ShortyGroup("Малыши");
        Malishi.Put(NoZnaika);
        Malishi.Put(Gunka);
        Malishi.Put(Pilulkin);

        System.out.printf("\n");

        Malishi.Listen(Znaika);
        Malishi.Like(LikeType.LOVE, story);
        Malishi.Like(LikeType.LIKE, countries);
        Malishi.MostLovely(LikeType.MORELIKE, traveler);

    }


}