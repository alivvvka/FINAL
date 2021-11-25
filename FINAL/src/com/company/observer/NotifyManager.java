package com.company.observer;

public interface NotifyManager {
    void registerSub(Observer sub);

    void removeSub(Observer sub);

    void notifySubs();
}
