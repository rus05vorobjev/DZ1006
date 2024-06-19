package familytree.familytreelist;

import familytree.AnotherType;
import familytree.human.CorparatarName;
import familytree.human.CorporatBirthData;
import familytree.human.Human;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FamilyTree<T extends AnotherType<T>> implements Serializable{
   private List<T> humans;
   private int humansID;

    public FamilyTree(){
        humans = new ArrayList<>();
    }
    public void addHuman(T human){
        if(!humans.contains(human)){
        humans.add(human);
        human.setID(humansID++);

        }
    }
    public T findHuman(int id){
        for(T human: humans){
            if(human.getId() == id){
                return human;
            }
        } return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Список людей:\n");
        for(T human: humans){

            sb.append(human);
            sb.append("\n");
            sb.append("\n");
        }return sb.toString();
    }
    public void sortName() {
        Collections.sort(humans, new CorparatarName<>());
    }

    public void sortBirthData() {
        Collections.sort(humans, new CorporatBirthData<>());
    }
}
