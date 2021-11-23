package com.company.Observer;

import com.company.FurnitureFactory.Furniture;

import java.util.List;

public interface Observer {
    void update(List<Furniture> furs);
}
