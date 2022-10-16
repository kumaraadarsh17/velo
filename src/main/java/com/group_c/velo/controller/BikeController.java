package com.group_c.velo.controller;

import com.group_c.velo.entity.Bike;
import com.group_c.velo.service.BikeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/bike")
public class BikeController {
    BikeService bikeService;

    @GetMapping("/{id}")
    public ResponseEntity<Bike> getBike(@PathVariable Long id){
        return new ResponseEntity<>(bikeService.getBike(id), HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<Bike> saveBike(@RequestBody Bike bike){
        return new ResponseEntity<>(bikeService.saveBike(bike), HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Bike>> getAllBikes(){
        return new ResponseEntity<>(bikeService.getAllBikes(), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteBike(@PathVariable Long id){
        bikeService.deleteBike(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
