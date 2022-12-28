public enum BringType {
    PUT("положили"),
    GRAB("схватили");

    private String val;

    private BringType(String s) {
        val = s;
    }

    public String toString() {
        return val;
    }
}
