package service.observing;

public interface OrderObservable {
    void addObserver(OrderObserver observer);
    void removeObserver(OrderObserver observer);
    void notifyObservers(String orderMessage);
}
