package lv7_abstract_interfaces;

import java.util.ArrayList;

public class LogisticManager {

    private ArrayList<Moveable> moveables;

    public LogisticManager() {
        moveables = new ArrayList<>();
    }

    public void addMoveable(Moveable moveable) {
        moveables.add(moveable);
    }

    public void moveAll(String destination) {
        for(Moveable moveable : moveables){
            moveable.move(destination);
        }
    }
}
