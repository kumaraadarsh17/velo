package com.group_c.velo.controller;

import com.group_c.velo.entity.Trip;
import com.group_c.velo.service.TripService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/trip")
public class TripController {
    TripService tripService;

    @GetMapping("/{id}")
    public ResponseEntity<Trip> getTrip(@PathVariable Long id){
        return new ResponseEntity<>(tripService.getTrip(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteTrip(@PathVariable Long id){
        tripService.deleteTrip(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PostMapping("/")
    public ResponseEntity<Trip> saveTrip(@RequestBody Trip trip){
        return new ResponseEntity<>(tripService.saveTrip(trip), HttpStatus.CREATED);
    }

    @GetMapping("/price/{id}")
    public ResponseEntity<Double> getPrice(@PathVariable Long id){
        Trip trip = tripService.getTrip(id);
        Long duration = trip.getEndTime().getTime() - trip.getStartTime().getTime();
        Double minutes = Double.valueOf(duration/(60.0*1000));
        Double price = minutes*trip.getBike().getRate();
        return new ResponseEntity<>(price, HttpStatus.OK);
    }

    @GetMapping("/duration/{id}")
    public ResponseEntity<Double> getDuration(@PathVariable Long id){
        Double duration = tripService.getDuration(id);
        return new ResponseEntity<>(duration, HttpStatus.OK);
    }
}
