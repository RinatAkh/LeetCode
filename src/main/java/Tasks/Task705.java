package Tasks;

import java.util.ArrayList;

public class Task705 {
    private ArrayList<Integer> list;
    public Task705() {
        this.list = new ArrayList<>();
    }

    public void add(int key) {
        if(!list.contains(key)) {
            list.add(key);
        }
    }

    public void remove(int key) {
        list.remove((Object)key);
    }

    public boolean contains(int key) {
        return list.contains(key);
    }
}
