public final class Sanya extends Fighter implements Skills {
    public Sanya(int atk, int def, String name) {super(atk, def, name);}
    @Override
    public void special(){
        System.out.println(name + " начинает флексить");
    }
}
