public class BattleMechanic {
    void battle() {
        ChooseCharacter chooseCharacter = new ChooseCharacter();
        Fighter fighter1 = chooseCharacter.getFighter1();
        Fighter fighter2 = chooseCharacter.getFighter2();
        System.out.println("Начался бой: " + fighter1.name + " и " + fighter2.name + ": ");
        UseSkill useSkill = new UseSkill();
        useSkill.useYourSkill((Skills) fighter1);
        useSkill.useYourSkill((Skills) fighter2);
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
