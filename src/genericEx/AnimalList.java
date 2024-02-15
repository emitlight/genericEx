package genericEx;

import java.util.ArrayList;

class AnimalList<T> extends Generic01{
    ArrayList<T> al = new ArrayList<>();
//선언한 al에 add메서드를 이용하여 요소를 넣을 것이다.
    void add(T animal) {
        al.add(animal);
    }

    T get(int index) {
        return al.get(index);
    }

    boolean remove(T animal) {
        return al.remove(animal);
    }

    int size() {
        return al.size();
    }
}
