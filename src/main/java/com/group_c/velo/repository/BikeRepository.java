package com.group_c.velo.repository;

import com.group_c.velo.entity.Bike;
import org.springframework.data.repository.CrudRepository;

public interface BikeRepository extends CrudRepository<Bike, Long> {
}
