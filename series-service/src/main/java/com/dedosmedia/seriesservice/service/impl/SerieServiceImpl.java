package com.dedosmedia.seriesservice.service.impl;

import com.dedosmedia.seriesservice.model.Serie;
import com.dedosmedia.seriesservice.repository.SerieRepository;
import com.dedosmedia.seriesservice.service.SerieService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SerieServiceImpl implements SerieService {

    SerieRepository serieRepository;

    public SerieServiceImpl(SerieRepository serieRepository) {
        this.serieRepository = serieRepository;
    }


    @Override
    public ResponseEntity<Serie> getSerieById(Integer id) {
        Optional<Serie> serie = serieRepository.findById(id);
        return new ResponseEntity<>(serie.orElse(null), HttpStatus.OK);
    }
}
