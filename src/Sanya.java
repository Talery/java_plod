public final class Sanya extends Fighter {
    public Sanya(int atk, int def, String name) {super(atk, def, name);}
    @Override
    public void attack() {
        System.out.println(name + " начинает флексить");
    }
}
