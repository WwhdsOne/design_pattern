package 行为型模式.观察者模式.JDK版;


import java.util.Observable;

public class SubscriptionSubject extends Observable {
    
    @Override
    public void notifyObservers(Object arg) {
        super.setChanged();
        super.notifyObservers(arg);
    }
}
