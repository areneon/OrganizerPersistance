package com.ptak.organizerpersistance.Moonshiner.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
public class ProductionDTO {

    private Long id;

    private double liters;

    private LocalDate date;


}
