public final class Nikita extends Fighter implements CanUseSkills {
    public Nikita(int atk, int def, String name) {super(atk, def, name);}
    @Override
    public void special() {
        System.out.println(name + " угрожающе потирает бороду");
    }
}
