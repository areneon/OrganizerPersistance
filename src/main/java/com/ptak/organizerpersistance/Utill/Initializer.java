package com.ptak.organizerpersistance.Utill;

import com.ptak.organizerpersistance.Moonshiner.Entities.ProductionEntity;
import com.ptak.organizerpersistance.Moonshiner.Repository.ProductionRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Slf4j
@Component
public class Initializer {

    @Autowired
    private ProductionRepository productionRepository;


    @EventListener(ApplicationReadyEvent.class)
    public void initializeDB() {

        if (productionRepository.findAll().size() == 0) {
            log.info("Started DB initialization");
            productionRepository.save(new ProductionEntity(0.1, LocalDate.now()));
        }
    }
}
