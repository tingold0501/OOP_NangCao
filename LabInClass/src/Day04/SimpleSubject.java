package Day04;

import java.util.ArrayList;
import java.util.List;

public class SimpleSubject implements Subject {
    private List<Observer> observers;
    private int value = 0;

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
        System.out.println("SimpleSubject.removeObserver()");
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(value);
        }
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        notifyObserver();
        System.out.println("setValue");
    }

    public SimpleSubject() {
        observers = new ArrayList<>();
    }

}
