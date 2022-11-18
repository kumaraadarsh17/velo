package com.group_c.velo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "bike")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Bike {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "company", nullable = false)
    private String Company;

    @Column(name = "gear")
    private Boolean Gear;

    @Column(name = "basket")
    private Boolean Basket;

    @Column(name = "rate", nullable = false)
    private Integer rate;

    @Column(name = "lat", nullable = false)
    private Float lat;

    @Column(name = "lon", nullable = false)
    private Float lon;

}
