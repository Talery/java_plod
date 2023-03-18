import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int fght1 = 0;
        int fght2 = 0;
        int defence1 = 0;
        int attack2 = 0;
        int defence2 = 0;
        int attack1 = 0;
        int result1;
        int result2;

        String fightername1 = "Боец1";
        String fightername2 = "Боец2";
        Scanner reader = new Scanner(System.in);
        System.out.print("Игрок1 - выбери цифру бойца: \n 1 - Плод. \n 2 - Саня.\n 3 - Никита.\n ");
        fght1 = reader.nextInt();
        System.out.print("Игрок2 - выбери цифру бойца: \n 1 - Плод. \n 2 - Саня.\n 3 - Никита.\n");
        fght2 = reader.nextInt();
        if (fght1 == 1) {

            Plod plod = new Plod(15, 30, "Плодик");
            attack1 = plod.atck;
            defence1 = plod.def;
            fightername1 = plod.name;
        } else if (fght1 == 2) {
            Nikita nikita = new Nikita(30, 10, "Никита");
            attack1 = nikita.atck;
            defence1 = nikita.def;
            fightername1 = nikita.name;
        } else if (fght1 == 3) {
            Sanya sanya = new Sanya(20, 20, "Саня");
            attack1 = sanya.atck;
            defence1 = sanya.def;
            fightername1 = sanya.name;
        }

        if (fght2 == 1) {

            Plod plod = new Plod(15, 30, "Плодик");
            attack2 = plod.atck;
            defence2 = plod.def;
            fightername2 = plod.name;
        } else if (fght2 == 2) {
            Nikita nikita = new Nikita(30, 10, "Никита");
            attack2 = nikita.atck;
            defence2 = nikita.def;
            fightername2 = nikita.name;
        } else if (fght2 == 3) {
            Sanya sanya = new Sanya(20, 20, "Саня");
            attack2 = sanya.atck;
            defence2 = sanya.def;
            fightername2 = sanya.name;
        } else {
            System.out.println("Ошибка");
            return;
        }
        if (attack1 - defence2 + attack2 - defence1 > 0) {
            System.out.println(fightername1 + " победил!");
        }
else if (attack1 - defence2 + attack2 - defence1 == 0) {
            System.out.println(fightername1 + " и " + fightername1 + "равны!");}
            else if (attack1 - defence2 + attack2 - defence1 < 0) {
                System.out.println(fightername2 + " победил!");
        }

    }

}