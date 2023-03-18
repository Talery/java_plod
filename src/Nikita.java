public final class Nikita extends fighters {
    public Nikita(int atck, int def, String name) {super(atck, def, name);}
    @Override
    public void attack() {
        System.out.println(name + " угрожающе потирает бороду");
    }
}
