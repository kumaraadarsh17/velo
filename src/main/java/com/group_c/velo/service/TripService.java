package com.group_c.velo.service;

import com.group_c.velo.entity.Trip;

public interface TripService {
    Trip getTrip(Long id);
    void deleteTrip(Long id);
    Trip saveTrip(Trip trip);
    Double getDuration(Long id);
}
