public final class Plod extends Fighter  {
    public Plod(int atk, int def, String name) { super(atk, def, name);}
    @Override
    public void specialattack() {
        System.out.println(name + " давит пузиком");
    }
}
