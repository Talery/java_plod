import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Игрок1 - выбери цифру бойца: \n 1 - Плод. \n 2 - Саня.\n 3 - Никита.\n ");
        int fght1 = reader.nextInt();
        System.out.print("Игрок2 - выбери цифру бойца: \n 1 - Плод. \n 2 - Саня.\n 3 - Никита.\n");
        int fght2 = reader.nextInt();

        Fighter fighter1;
        Fighter fighter2;

        switch (fght1) {
            case 1: fighter1 = new Plod(15, 30, "Плодик");
                break;
            case 2: fighter1 =  new Nikita(30, 10, "Никита");
                break;
            case 3: fighter1 = new Sanya(20, 20, "Саня");
                break;
            default: return;
        }
        switch (fght2) {
            case 1: fighter2 = new Plod(15, 30, "Плодик");
                break;
            case 2: fighter2 =  new Nikita(30, 10, "Никита");
                break;
            case 3: fighter2 = new Sanya(20, 20, "Саня");
                break;
            default: return;
        }


        System.out.println("Начался бой: " + fighter1.name + " и " + fighter2.name + ": ");
        if (fighter1.atk - fighter2.def + fighter2.atk - fighter1.def > 0) {
            System.out.println(fighter1.name + " победил!");
        }
        else if (fighter1.atk - fighter2.def + fighter2.atk - fighter1.def == 0) {
            System.out.println(fighter1.name + " и " + fighter2.name + " равны!");
        }

        else if (fighter1.atk - fighter2.def + fighter2.atk - fighter1.def < 0) {
            System.out.println(fighter2.name + " победил!");
        }

    }

}