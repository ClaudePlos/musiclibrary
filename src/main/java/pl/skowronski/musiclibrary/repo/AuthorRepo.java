package pl.skowronski.musiclibrary.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.skowronski.musiclibrary.models.Author;

import java.util.List;

@Repository
public interface AuthorRepo extends JpaRepository<Author, Long> {

    @Query(value = "SELECT AUTHOR.NAME as Author, COUNT(AUTHOR.NAME) as CategoryCount, ALBUM.ALBUM_CATEGORY as AlbumCategory\n" +
            "FROM AUTHOR, ALBUM \n" +
            "GROUP BY ALBUM_CATEGORY", nativeQuery = true)
    List<AuthorDTO> getCathegoryCount();
}
