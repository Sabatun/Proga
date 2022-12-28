public enum ThinkType {
    BAD("уже мертвый");

    private String val;

    private ThinkType(String s) {
        val = s;
    }

    public String toString() {
        return val;
    }
}
