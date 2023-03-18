public final class Plod extends fighters {
    public Plod(int atck, int def, String name) { super(atck, def, name);}
    @Override
    public void attack() {
        System.out.println(name + " давит пузиком");
    }
}
