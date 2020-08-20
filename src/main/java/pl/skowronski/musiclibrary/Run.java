package pl.skowronski.musiclibrary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.skowronski.musiclibrary.models.Album;
import pl.skowronski.musiclibrary.models.AlbumCategory;
import pl.skowronski.musiclibrary.models.Author;
import pl.skowronski.musiclibrary.repo.AlbumRepo;
import pl.skowronski.musiclibrary.repo.AuthorRepo;

import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class Run {

    private AuthorRepo authorRepo;
    private AlbumRepo albumRepo;

    @Autowired
    public Run(AuthorRepo authorRepo, AlbumRepo albumRepo) {
        this.authorRepo = authorRepo;
        this.albumRepo = albumRepo;

        Album album = new Album();
        album.setTitle("The Joshua Tree");
        album.setAlbumCategory(AlbumCategory.ROCK);
        album.setIsbn("8asd9-asdasd234234");

        Author author = new Author();
        author.setName("U2");
        author.setSurname("-");
        author.setAlbumSet(Stream.of(album).collect(Collectors.toSet()));

        albumRepo.save(album);
        authorRepo.save(author);




    }




}
