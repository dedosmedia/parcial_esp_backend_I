package com.dedosmedia.episodes.entity;

import lombok.*;
import javax.persistence.*;

@Entity
@Table(name = "episodes")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class Episode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Double score;

}
