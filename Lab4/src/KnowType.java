public enum KnowType {
    THINK("стал думать, как сделать"),
    KNOW("долго думал и придумал сделать");
    private String val;

    private KnowType(String s) {
        val = s;
    }

    public String toString() {
        return val;
    }
}
