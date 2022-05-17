package antonProject.service;

import antonProject.model.Region;

import java.util.Optional;

public interface RegionService {
    Optional<Region> findByCode(Long code);
    Region save(Region region);
    void deleteByCode(Long code);
}
