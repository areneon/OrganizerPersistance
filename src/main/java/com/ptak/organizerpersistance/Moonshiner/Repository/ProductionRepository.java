package com.ptak.organizerpersistance.Moonshiner.Repository;

import com.ptak.organizerpersistance.Moonshiner.Entities.ProductionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductionRepository extends JpaRepository<ProductionEntity,Long> {
}
