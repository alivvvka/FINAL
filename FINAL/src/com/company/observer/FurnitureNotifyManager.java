package com.company.observer;

import com.company.factory.Furniture;

import java.util.ArrayList;
import java.util.List;

public class FurnitureNotifyManager implements NotifyManager{
    private List<Observer> subs = new ArrayList<>();
    private List<Furniture> furs = new ArrayList<>();

    @Override
    public void registerSub(Observer sub) {
        subs.add(sub);
    }

    @Override
    public void removeSub(Observer sub) {
        subs.remove(sub);
    }

    @Override
    public void notifySubs() {
        for (Observer sub:subs){
            sub.update(this.furs);
        }
    }

    public List<Observer> getSubs() {
        return subs;
    }

    public void addFurniture(Furniture fur){
        furs.add(fur);
        notifySubs();
    }

    public void returnFurniture(Furniture fur){
        furs.add(fur);
    }

    public void removeFurniture(Furniture fur){
        furs.remove(fur);
    }

    public List<Furniture> getFurs() {
        return furs;
    }
}
