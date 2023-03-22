import java.util.Scanner;


public class ChooseCharacter2 {
    Scanner reader = new Scanner(System.in);
    Fighter fighter2;

    public ChooseCharacter2(){
        System.out.print("Игрок2 - выбери цифру бойца: \n 1 - Плод. \n 2 - Саня.\n 3 - Никита.\n ");
        int fght1 = reader.nextInt();

        switch (fght1) {
            case 1 -> fighter2 = new Plod(15, 30, "Плодик");
            case 2 -> fighter2 = new Nikita(30, 10, "Никита");
            case 3 -> fighter2 = new Sanya(20, 20, "Саня");
            default -> {
            }
        }


        
    }

    public static void chooseCharacter2() {
    }

    public Fighter getFighter2() {
        return fighter2;
    }


}
