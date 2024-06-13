package familytree;

import java.util.ArrayList;
import java.util.List;

public class FamilyTree {
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

    public static class FileHandler {
    }
}
