package familytree.model.human;

import java.io.Serializable;
import java.time.LocalDate;



public interface AnotherType<T> extends Serializable  {
    void setID(int id);
    int getId();
    T getMother();
    T getFather();
    int getAge();
    void addChild(T human);
    String getName();
    int getPeriod(LocalDate birthData, LocalDate deathData);
    LocalDate getBirthData();
    String getFatherInfo();
    String getMotherInfo();
    String getChildrenInfo();
    String getInfo();

}
