package edu.epam.shape.entity;

import edu.epam.shape.observer.Observable;
import edu.epam.shape.observer.Observer;
import edu.epam.shape.observer.impl.CubeObserver;

public interface Shape<T extends Observer> extends Observable<T> {

    public void attach(T observer);
    public void detach(T observer);
    public void notifyObserver();
}
