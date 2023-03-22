import java.util.Scanner;

public class ChooseCharacter1 {
    Scanner reader = new Scanner(System.in);
    Fighter fighter1;

    public ChooseCharacter1() {
        System.out.print("Игрок1 - выбери цифру бойца: \n 1 - Плод. \n 2 - Саня.\n 3 - Никита.\n ");
        int fght1 = reader.nextInt();
        switch (fght1) {
            case 1 -> fighter1 = new Plod(15, 30, "Плодик");
            case 2 -> fighter1 = new Nikita(30, 10, "Никита");
            case 3 -> fighter1 = new Sanya(20, 20, "Саня");
            default -> {
            }
        }
    }

    public Fighter getFighter1() {
        return fighter1;
    }
}


