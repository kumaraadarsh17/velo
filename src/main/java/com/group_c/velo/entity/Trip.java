package com.group_c.velo.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "trip")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "trip_id", nullable = false)
    private Long tripId;

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id", referencedColumnName = "roll_number")
    private User user;

    @ManyToOne(optional = false)
    @JoinColumn(name = "bike_id", referencedColumnName = "id", nullable = false)
    private Bike bike;

    @Column(name = "start_time", nullable = false)
    private Time startTime;

    @Column(name = "end_time", nullable = false)
    private Time endTime;
}
