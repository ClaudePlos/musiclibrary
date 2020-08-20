package pl.skowronski.musiclibrary.models;

import javax.persistence.*;

@Entity
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String isbn;

    @Enumerated(EnumType.STRING)
    private AlbumCategory albumCategory;

    public Album() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public AlbumCategory getAlbumCategory() {
        return albumCategory;
    }

    public void setAlbumCategory(AlbumCategory albumCategory) {
        this.albumCategory = albumCategory;
    }
}
