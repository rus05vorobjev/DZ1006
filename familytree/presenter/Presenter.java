package familytree.presenter;

import familytree.model.human.AnotherType;
import familytree.model.familytreelist.FamilyTree;
import familytree.model.human.Gender;
import familytree.model.human.Human;
import familytree.view.View;

import java.time.LocalDate;


public class Presenter {
    private View view;
    private FamilyTree fm;

    public Presenter(View view) {
        this.view = view;
        this.fm = new FamilyTree<>();

    }

    public void addHuman(String name, Gender gender, LocalDate age) {
        Human human = new Human(name, gender, age);
        fm.addHuman(human);
        getHumanInfo();


    }

    public void getHumanInfo() {
        String answer = fm.getHumanInfo();
        view.printAnswer(answer);
    }

    public void findHuman(int id) {
        System.out.println(fm.findHuman(id));

    }

    public void sortByName() {
        fm.sortName();
        getHumanInfo();
    }
}
