package com.dedosmedia.seriesservice.service;

import com.dedosmedia.seriesservice.model.Serie;
import org.springframework.http.ResponseEntity;

public interface SerieService {

    ResponseEntity<Serie> getSerieById(Integer id);




}
