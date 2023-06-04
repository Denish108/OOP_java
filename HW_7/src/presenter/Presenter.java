package presenter;

import model.armors.EpicArmor;
import model.armors.MagiciansRobe;
import model.charaters.BlackMage;
import model.charaters.Knight;
import model.weapons.Sword;
import model.weapons.WizardsStaff;
import view.View;

public class Presenter {
    public Presenter() {
        view = new View();
    }

    private View view;
    public void Fight() {
        int round = 1;
        while (figterOne.getHealthPoints() > 0 && figterTwo.getHealthPoints() > 0) {
            System.out.println("Раунд: " + round++);
            view.Attack(figterOne, figterTwo);
            figterOne.attack(figterTwo);
            view.Attack(figterTwo, figterOne);
            figterTwo.attack(figterOne);
            figterOne.updateLevel();
            figterTwo.updateLevel();
        }
        if(figterOne.getHealthPoints() == 0)
            System.out.println("Победил "  + figterTwo);
        else
            System.out.println("Победил " + figterOne);
    }


    private Knight figterOne = new Knight("Рыцарь", new Sword("Меч", 10, 0), new EpicArmor("Броня Эпик", 100, 0));
    private BlackMage figterTwo = new BlackMage("Маг", new WizardsStaff("Посох", 10, 0), new MagiciansRobe("Роба", 10, 0));
}
