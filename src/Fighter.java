abstract public class Fighter {
    String name;
    int atk;
    int def;

    abstract void specialattack();
    public Fighter(int atk, int def, String name) {
        this.atk = atk;
        this.def = def;
        this.name = name;
    }
}