public class BattleMechanic {
    public class UseSkill {
        void useYourSkill(CanUseSkills fighter) {fighter.special();}
    }
    void battle() {
        ChooseCharacter ChooseCharacter = new ChooseCharacter();

        Fighter fighter1 = ChooseCharacter.getFighter1();
        Fighter fighter2 = ChooseCharacter.getFighter2();
        System.out.println("Начался бой: " + fighter1.name + " и " + fighter2.name + ": ");

        UseSkill useSkill = new UseSkill();
        useSkill.useYourSkill((CanUseSkills) fighter1);
        useSkill.useYourSkill((CanUseSkills) fighter2);

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
