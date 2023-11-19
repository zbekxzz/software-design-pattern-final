package service.observing;

public interface OrderObservable {
    void notifyObservers(String orderMessage);
}
