package com.dedosmedia.episodes.service.impl;

import com.dedosmedia.episodes.entity.Episode;
import com.dedosmedia.episodes.repository.EpisodeRepository;
import com.dedosmedia.episodes.service.EpisodeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EpisodeServiceImpl implements EpisodeService {

    EpisodeRepository episodeRepository;

    public EpisodeServiceImpl(EpisodeRepository episodeRepository) {
        this.episodeRepository = episodeRepository;
    }


    @Override
    public ResponseEntity<Episode> getEpisodeById(Integer id) {
        Optional<Episode> episode = episodeRepository.findById(id);
        return new ResponseEntity<>(episode.orElse(null), HttpStatus.OK);
    }
}
