package com.dedosmedia.seriesservice.controller;


import com.dedosmedia.seriesservice.model.Serie;
import com.dedosmedia.seriesservice.service.SerieService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/series")
public class SeriesController {

    SerieService serieService;

    public SeriesController(SerieService serieService) {
        this.serieService = serieService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Serie> getSerieById(@PathVariable Integer id){
        return serieService.getSerieById(id);
    }

}
