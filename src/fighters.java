abstract public class fighters {
    String name;
    int atck;
    int def;

    abstract void attack();

    public fighters(int atck, int def, String name) {
        this.atck = atck;
        this.def = def;
        this.name = name;
    }
}