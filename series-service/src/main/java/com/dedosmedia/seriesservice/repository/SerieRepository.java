package com.dedosmedia.seriesservice.repository;

import com.dedosmedia.seriesservice.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SerieRepository extends JpaRepository<Serie, Integer> {
}
