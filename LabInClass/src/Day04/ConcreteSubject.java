package Day04;

public class ConcreteSubject implements Subject {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public void notifyObserver() {
        // TODO Auto-generated method stub

    }

    @Override
    public void registerObserver(Observer o) {
        // TODO Auto-generated method stub

    }

    @Override
    public void removeObserver(Observer o) {
        // TODO Auto-generated method stub

    }

}
