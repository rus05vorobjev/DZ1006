package familytree.human;


import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Human implements Serializable, Comparable<Human> {
   private int id;
    private String name;

    public LocalDate getBirthData() {
        return birthData;
    }

    private LocalDate birthData;
    private LocalDate deathData;
    private Human father,mother;
    private List<Human> children;
    private Gender gender;


    public Human(String name, Gender gender, LocalDate birthData,
                 LocalDate deathData, Human father, Human mother){

        this.name = name;
        this.birthData = birthData;
        this.deathData = deathData;
        this.gender = gender;
        this.father = father;
        this.mother = mother;
        children = new ArrayList<>();

    }
    public Human(String name,Gender gender, LocalDate birthData) {
        this(name, gender, birthData, null,null,null);
    }

    public Human(String name,Gender gender, LocalDate birthData,Human father, Human mother) {
        this(name, gender, birthData, null,father,mother);
    }
    public void addChild(Human human){
        children.add(human);
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }

    public void setID(int id){
        this.id = id;
    }
    public int getPeriod(LocalDate birthData, LocalDate deathData){
        Period diff = Period.between(birthData, LocalDate.now());
        return diff.getYears();
    }

    public int getAge(){
        if(deathData == null){
            return getPeriod(birthData, LocalDate.now());

        } else return getPeriod(birthData,deathData);
    }
    public Human getMother() {
        return mother;
    }
    public String getMotherInfo(){
        String res = "";
        Human mother = getMother();
        if( mother == null){
            res += "нет";
        }else res += mother.getName();
        return res;
    }
    public Human getFather() {
        return father;
    }
    public String getFatherInfo(){
        String res = "";
        Human father = getFather();
        if( father == null){
            res += "нет";
        }else res += father.getName();
        return res;
    }
    public String getChildrenInfo() {
        StringBuilder sb = new StringBuilder();
        if (children.size() != 0) {
            sb.append(children.get(0).getName());
            for (int i = 1; i < children.size(); i++) {
                sb.append(", ");
                sb.append(children.get(i).getName());
            }
        } else sb.append("нет");
        return sb.toString();
    }
    public String getInfo(){
        StringBuilder sb = new StringBuilder();
        sb.append("Id - ").append(id);
        sb.append(", Имя - ").append(name);
        sb.append(", Пол - ").append(gender);
        sb.append(", День рождения - ").append(birthData);
        sb.append(", Возраст - ").append(getAge());
        sb.append("\nОтец: ").append(getFatherInfo());
        sb.append("\nМать: ").append(getMotherInfo());
        sb.append("\nДети: ").append(getChildrenInfo());

        return sb.toString();
    }

    @Override
    public String toString() {
        return getInfo();
    }

    @Override
    public int compareTo(Human o) {
        return this.name.compareTo(o.name);
    }
}


