package com.group_c.velo.service;

import com.group_c.velo.entity.Bike;
import com.group_c.velo.repository.BikeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class BikeServiceImplementation implements BikeService{
    BikeRepository bikeRepository;

    @Override
    public Bike getBike(Long id) {
        Optional<Bike> bike = bikeRepository.findById(id);
        if(bike.isPresent()){
            return bike.get();
        }   else return null; //TODO: create an exception for bike not found
    }

    @Override
    public Bike saveBike(Bike bike) {
        return bikeRepository.save(bike);
    }

    @Override
    public void deleteBike(Long id) {
        bikeRepository.deleteById(id);
    }

    @Override
    public List<Bike> getAllBikes() {
        return (List<Bike>) bikeRepository.findAll();
    }
}
