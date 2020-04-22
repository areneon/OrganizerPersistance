package com.ptak.organizerpersistance.Moonshiner.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Production {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double liters;

    private LocalDate date;

    public Production() {
    
    }

    public Production(double liters, LocalDate date) {
        this.liters = liters;
        this.date = date;
    }
}
