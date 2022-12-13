public enum LikeType {
    LOVE("очень любили эти"),
    LIKE("нравилось слушать о"),
    MORELIKE("больше всего любили");
    private String val;

    private LikeType(String s) {
        val = s;
    }

    public String toString() {
        return val;
    }

}
