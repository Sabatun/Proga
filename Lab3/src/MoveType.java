public enum MoveType {
    STAY("вскочил с"),
    JUMP("выпрыгнул в"),
    RUN("убежал к"),
    RETURN("вернулся с");
    private String val;

    private MoveType(String s) {
        val = s;
    }

    public String toString() {
        return val;
    }
}
