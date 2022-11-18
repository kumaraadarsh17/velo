package com.group_c.velo.service;

import com.group_c.velo.entity.Trip;
import com.group_c.velo.repository.TripRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class TripServiceImplementation implements TripService{
    TripRepository tripRepository;

    @Override
    public Trip getTrip(Long id) {
        Optional<Trip> trip = tripRepository.findById(id);
        if(trip.isPresent()){
            return trip.get();
        }   else return null; //TODO: create an exception for trip not found
    }

    @Override
    public void deleteTrip(Long id) {
        tripRepository.deleteById(id);
    }

    @Override
    public Trip saveTrip(Trip trip) {
        return tripRepository.save(trip);
    }
}
