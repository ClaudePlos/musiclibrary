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

        Album album1 = new Album();
        album1.setTitle("The Joshua Tree");
        album1.setAlbumCategory(AlbumCategory.ROCK);
        album1.setIsbn("8asd9-asdasd234234");

        Album album2 = new Album();
        album2.setTitle("Zooropa");
        album2.setAlbumCategory(AlbumCategory.ROCK);
        album2.setIsbn("8a234-asdsdf234wer4");

        Album album3 = new Album();
        album3.setTitle("Pop");
        album3.setAlbumCategory(AlbumCategory.POP);
        album3.setIsbn("8a23d9-asda23423sdf4");

        Author author = new Author();
        author.setName("U2");
        author.setSurname("-");
        author.setAlbumSet(Stream.of(album1,album2,album3).collect(Collectors.toSet()));

        albumRepo.save(album1);
        albumRepo.save(album2);
        albumRepo.save(album3);
        authorRepo.save(author);




    }




}
