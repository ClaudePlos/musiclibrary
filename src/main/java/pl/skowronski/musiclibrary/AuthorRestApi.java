package pl.skowronski.musiclibrary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.skowronski.musiclibrary.repo.AuthorDTO;
import pl.skowronski.musiclibrary.repo.AuthorRepo;

import java.util.List;

@RestController
public class AuthorRestApi {

    private AuthorRepo authorRepo;

    @Autowired
    public AuthorRestApi(AuthorRepo authorRepo) {
        this.authorRepo = authorRepo;
    }

    @GetMapping("/getAuthorInfo")
    public List<AuthorDTO> get() {
        return authorRepo.getCathegoryCount();
    }
}
