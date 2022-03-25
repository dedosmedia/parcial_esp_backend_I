package com.dedosmedia.seriesservice.repository.feign;

import com.dedosmedia.seriesservice.model.dto.EpisodeWS;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "episode-service")
@RequestMapping("/episodes")
public interface EpisodeFeignRespository {

    @GetMapping("/{id}")
    ResponseEntity<EpisodeWS> getEpisodeById(@PathVariable Integer id);
}
