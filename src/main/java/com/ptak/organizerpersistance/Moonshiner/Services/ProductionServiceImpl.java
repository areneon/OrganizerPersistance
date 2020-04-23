package com.ptak.organizerpersistance.Moonshiner.Services;

import com.ptak.organizerpersistance.Moonshiner.DTO.ProductionDTO;
import com.ptak.organizerpersistance.Moonshiner.Entities.ProductionEntity;
import com.ptak.organizerpersistance.Moonshiner.Repository.ProductionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductionServiceImpl implements ProductionService {

    @Autowired
    ProductionRepository productionRepository;

    @Override
    public List<ProductionDTO> getAllProductions() {
        List<ProductionDTO> allProductions= productionRepository.findAll().stream().map(ProductionEntity::toDTO).collect(Collectors.toList());
        return allProductions;
    }

    @Override
    public ProductionDTO getProductionbyId(Long id) {

       return productionRepository.findById(id).map(p->p.toDTO()).get();
    }
}