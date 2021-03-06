package pl.music_portal;

import lombok.Data;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

@Entity
@Data
public class Artist {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String description;
    private String imageUrl;
    //fans/followers/popularity
    @ManyToMany
    private List<Genre> genres = new LinkedList<>();
    //link
    //ratings
}
