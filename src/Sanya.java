public final class Sanya extends fighters {
    public Sanya(int atck, int def, String name) {super(atck, def, name);}
    @Override
    public void attack() {
        System.out.println(name + " начинает флексить");
    }
}
