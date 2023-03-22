public final class Nikita extends Fighter  {
    public Nikita(int atk, int def, String name) {super(atk, def, name);}
    @Override
    public void specialattack() {
        System.out.println(name + " угрожающе потирает бороду");
    }
}
