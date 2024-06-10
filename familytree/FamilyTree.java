package familytree;

import java.util.ArrayList;
import java.util.List;

public class FamilyTree {
    List<Human> humans;

    public FamilyTree(){
        humans = new ArrayList<>();
    }
    public void addHuman(Human human){
        humans.add(human);
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
}
