public class Exceptions  {
    public static class ExistException extends RuntimeException {
        //unchecked
        public ExistException(String s) {
            super(s);
        }
    }

    public static class ScenarioException extends Exception {
        //checked
        public ScenarioException() {
            super();
        }
    }

}
