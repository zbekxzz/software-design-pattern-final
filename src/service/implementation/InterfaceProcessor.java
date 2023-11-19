package service.implementation;

import service.Interface;

public class InterfaceProcessor {
    private Interface interfaceStrategy;
    public void setInterfaceStrategy(Interface interfaceStrategy) {
        this.interfaceStrategy = interfaceStrategy;
    }

    public void getInterface() {
        if (interfaceStrategy != null) {
            interfaceStrategy.getInterface();
        } else {
            System.out.println("There some errors, please try again");
        }
    }

}
