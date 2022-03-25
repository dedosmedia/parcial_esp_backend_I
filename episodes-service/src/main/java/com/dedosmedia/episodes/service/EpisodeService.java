package com.dedosmedia.episodes.service;

import com.dedosmedia.episodes.entity.Episode;
import org.springframework.http.ResponseEntity;

public interface EpisodeService {

    ResponseEntity<Episode> getEpisodeById(Integer id);


}
