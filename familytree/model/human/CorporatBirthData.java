package familytree.model.human;


import java.util.Comparator;

public class CorporatBirthData<T extends AnotherType<T>> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return o1.getBirthData().compareTo(o2.getBirthData());
    }
}
