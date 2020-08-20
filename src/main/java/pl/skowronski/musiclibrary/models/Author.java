package pl.skowronski.musiclibrary.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;

    @OneToMany
    @JoinColumn(name = "author_id")
    private Set<Album> albumSet;

    public Author() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Set<Album> getAlbumSet() {
        return albumSet;
    }

    public void setAlbumSet(Set<Album> albumSet) {
        this.albumSet = albumSet;
    }
}
