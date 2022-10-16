package com.group_c.velo.service;

import com.group_c.velo.entity.Bike;

import java.util.List;

public interface BikeService {
    Bike getBike(Long id);
    Bike saveBike(Bike bike);
    void deleteBike(Long id);
    List<Bike> getAllBikes();
}
