package com.ptak.organizerpersistance.Moonshiner.Repository;

import com.ptak.organizerpersistance.Moonshiner.Entities.Production;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductionRepository extends JpaRepository<Production,Long> {
}
