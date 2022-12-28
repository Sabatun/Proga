public enum LikeType {
    LOVE("очень любили эти"),
    LIKE("нравилось слушать о"),
    INTEREST("было очень интресно"),
    MORELIKE("больше всего любили");
    private String val;

    private LikeType(String s) {
        val = s;
    }

    public String toString() {
        return val;
    }

}
