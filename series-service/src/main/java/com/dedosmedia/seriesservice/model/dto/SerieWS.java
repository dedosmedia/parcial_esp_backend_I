package com.dedosmedia.seriesservice.model.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@Builder
public class SerieWS {
    private List<EpisodeWS> episodes;
}
