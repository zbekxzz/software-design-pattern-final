package service.observing;

import DB.DBConnection;

import java.util.ArrayList;
import java.util.List;

public class OrderSystem implements OrderObservable {
    DBConnection db = DBConnection.getDbConnection();
    private List<OrderObserver> observers = db.selectAllSuppliers();

    @Override
    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(OrderObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String orderMessage) {
        for (OrderObserver observer : observers) {
            observer.update(orderMessage);
        }
    }

    // Simulate a new order being placed
    public void placeOrder(String orderMessage) {
        System.out.println("New order placed: " + orderMessage);
        notifyObservers(orderMessage);
    }
}