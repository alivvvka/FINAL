package com.company.observer;

import com.company.factory.Furniture;

import java.util.List;

public interface Observer {
    void update(List<Furniture> furs);
}
