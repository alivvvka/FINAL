package com.company.Observer;

public interface NotifyManager {
    void registerSub(Observer sub);

    void removeSub(Observer sub);

    void notifySubs();
}
