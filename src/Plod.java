public final class Plod extends Fighter implements CanUseSkills {
    public Plod(int atk, int def, String name) { super(atk, def, name);}
    @Override
    public void special() {
        System.out.println(name + " давит пузиком");
    }
}
