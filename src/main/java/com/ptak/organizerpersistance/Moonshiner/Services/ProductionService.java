package com.ptak.organizerpersistance.Moonshiner.Services;

import com.ptak.organizerpersistance.Moonshiner.DTO.ProductionDTO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductionService {

    List<ProductionDTO> getAllProductions();

    ProductionDTO getProductionbyId(Long id);

}
