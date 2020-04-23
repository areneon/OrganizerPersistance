package com.ptak.organizerpersistance.Moonshiner.Entities;

import com.ptak.organizerpersistance.Moonshiner.DTO.ProductionDTO;
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
public class ProductionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double liters;

    private LocalDate date;

    public ProductionEntity() {

    }

    public ProductionEntity(double liters, LocalDate date) {
        this.liters = liters;
        this.date = date;
    }

    public ProductionDTO toDTO() {
        return new ProductionDTO(
                this.id,
                this.liters,
                this.date);
    }
}
