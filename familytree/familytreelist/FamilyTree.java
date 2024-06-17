package familytree.familytreelist;

import familytree.human.CorporatBirthData;
import familytree.human.Human;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FamilyTree implements Serializable{
   private List<Human> humans;
   private int humansID;

    public FamilyTree(){
        humans = new ArrayList<>();
    }
    public void addHuman(Human human){
        if(!humans.contains(human)){
        humans.add(human);
        human.setID(humansID++);

        }
    }
    public Human findHuman(int id){
        for(Human human: humans){
            if(human.getId() == id){
                return human;
            }
        } return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Список людей:\n");
        for(Human human: humans){

            sb.append(human);
            sb.append("\n");
            sb.append("\n");
        }return sb.toString();
    }

    public void sortFamilyTree(){
        Collections.sort(humans);
    }
    public void sortBirthData() {
        Collections.sort(humans, new CorporatBirthData());
    }
}
