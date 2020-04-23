package com.ptak.organizerpersistance.Moonshiner.Api;

import com.ptak.organizerpersistance.Moonshiner.DTO.ProductionDTO;
import com.ptak.organizerpersistance.Moonshiner.Repository.ProductionRepository;
import com.ptak.organizerpersistance.Moonshiner.Services.ProductionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/moonshine")
public class MoonshinerController {

    @Autowired
    private ProductionService productionService;

    @RequestMapping("/production/all")
    public List<ProductionDTO> getAllProductions(){
        return productionService.getAllProductions();
    }

    @RequestMapping("/production/{id}")
    public ProductionDTO getAllProductions(@PathVariable("id")Long id){
        return productionService.getProductionbyId(id);
    }

}
