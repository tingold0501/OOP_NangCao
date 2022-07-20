package Day04;

public class SimpleObserver implements Observer {
    private int value;
    private Subject simpleSubject; // mối quan hệ giữa người đăng ký và nhà xuất bản

    public SimpleObserver(Subject simpleSubject) {
        this.simpleSubject = simpleSubject;
        this.simpleSubject.registerObserver(this);
    }// mối quan hệ assosiation

    @Override
    public void update(int value) {
        this.value = value;
        this.display();
    }

    public void display() {
        System.out.println("Value: " + value);
    }

}
