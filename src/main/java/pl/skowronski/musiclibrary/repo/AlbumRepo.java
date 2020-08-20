package pl.skowronski.musiclibrary.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.skowronski.musiclibrary.models.Album;

@Repository
public interface AlbumRepo extends JpaRepository<Album, Long> {
}
