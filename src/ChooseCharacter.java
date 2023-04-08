import java.util.Scanner;

public class ChooseCharacter {
    Fighter fighter1;
    Fighter fighter2;
    public ChooseCharacter() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Игрок1 - выбери цифру бойца: \n 1 - Плод. \n 2 - Саня.\n 3 - Никита.\n ");
        int fght1 = reader.nextInt();
        switch (fght1) {
            case 1 -> fighter1 = new Plod(15, 30, "Плодик");
            case 2 -> fighter1 = new Nikita(30, 10, "Никита");
            case 3 -> fighter1 = new Sanya(20, 20, "Саня");

            default -> throw new IllegalStateException("Unexpected value: " + fght1);
        }
        System.out.print("Игрок2 - выбери цифру бойца: \n 1 - Плод. \n 2 - Саня.\n 3 - Никита.\n ");
        int fght2 = reader.nextInt();

        switch (fght2) {
            case 1 -> fighter2 = new Plod(15, 30, "Плодик");
            case 2 -> fighter2 = new Nikita(30, 10, "Никита");
            case 3 -> fighter2 = new Sanya(20, 20, "Саня");

            default -> throw new IllegalStateException("Unexpected value: " + fght2);
        }
    }

    public Fighter getFighter1() {
        return fighter1;
    }
   public Fighter getFighter2() {
    return fighter2;
}
}

