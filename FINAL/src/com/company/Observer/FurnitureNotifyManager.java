package com.company.Observer;

import com.company.FurnitureFactory.Furniture;

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

    public void addFurniture(Furniture fur){
        furs.add(fur);
        notifySubs();
    }

}
