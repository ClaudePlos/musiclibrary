package pl.skowronski.musiclibrary.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.skowronski.musiclibrary.models.Author;

@Repository
public interface AuthorRepo extends JpaRepository<Author, Long> {
}
