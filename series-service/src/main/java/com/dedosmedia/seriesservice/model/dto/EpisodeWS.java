package com.dedosmedia.seriesservice.model.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class EpisodeWS {

    private Integer id;
    private String name;
    private Double score;
}
