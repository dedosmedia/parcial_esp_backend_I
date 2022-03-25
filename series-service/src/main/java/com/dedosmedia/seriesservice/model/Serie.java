package com.dedosmedia.seriesservice.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "series")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class Serie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Integer episodeId;


}
